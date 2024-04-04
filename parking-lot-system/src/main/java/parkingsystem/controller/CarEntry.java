package parkingsystem.controller;

import parkingsystem.model.dto.Car;
import parkingsystem.model.dto.ParkingSpace;
import parkingsystem.repos.ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class CarEntry {
    /*
    1. 입차 버튼을 눌렀을 때 각 주차장에 입차 가능한 대수를 출력해주기.
    2. 사용자로부터 차량 정보(차량번호, carisBig 등)를 입력받기.
    3. 입력받은 차의 번호와 차종(대형, 소형)을 입력받아서 대형차는 ParkingLot메소드에 일반주차장인 parkingLot에, 소형차는 주차타워인 ParkingTower에 주차하기.
    4. 각 주차장에 주차되었다면 마지막에 어느주차장에 어느칸에 주차되었는지 위치를 출력해주기.
     */
    private ParkingLot parkingLot;
    private ArrayList<ParkingSpace> parkingLotList;
    private ArrayList<ParkingSpace> parkingTowerList;
    private Scanner sc = new Scanner(System.in);

    public CarEntry(ParkingLot parkingLot) { // 생성자
        this.parkingLot = parkingLot; // ParkingLot 객체를 생성자로 받아서 초기화
        this.parkingLotList = parkingLot.getParkingLot(); // ParkingLot 객체의 parkingLot 필드를 초기화
        this.parkingTowerList = parkingLot.getParkingTower(); // ParkingLot 객체의 parkingTower 필드를 초기화
    }

    // 1. 입차 버튼을 눌렀을 때 각 주차장에 입차 가능한 대수를 출력해주기.
    public void entry() {
        System.out.println("입차 가능한 주차장 대수 : " + (parkingLotList.size()- ParkingLot.lotCount));
        System.out.println("입차 가능한 주차타워 대수 : " + (parkingTowerList.size()-ParkingLot.towerCount));
    }

    // 2. 사용자로부터 차량 정보(차량번호, carisBig 등)를 입력받기.
    public Car inputCarInfo() {
        System.out.print("차량번호 : ");
        int carNum = sc.nextInt();
        System.out.print("차종(대형차 : 1, 소형차 : 2) : ");
        int carSize = sc.nextInt();

        return new Car(carNum, carSize == 1);
    }

    // 3. 입력받은 차의 번호와 차종(대형, 소형)을 입력받아서 대형차는 ParkingLot메소드에 일반주차장인 parkingLot에, 소형차는 주차타워인 ParkingTower에 주차하기.
    public void parkCar(
            Car car) { // 호출이 안되는 이유는? -> ParkingController에서 CarEntry를 호출하지 않았기 때문 -> 호출 했는데? -> entry() 메소드만 호출했음

        for (ParkingSpace space : parkingLotList) {
            if (space.getParkedCar() == null) {
                continue;
            } if (space.getParkedCar().getCarNum() == car.getCarNum()){
                System.out.println("이미 주차된 차량입니다.");
                return;
            }
        }
        for (ParkingSpace space : parkingTowerList) {
            if (space.getParkedCar() == null) {
                continue;
            } if (space.getParkedCar().getCarNum() == car.getCarNum()){
                System.out.println("이미 주차된 차량입니다.");
                return;
            }
        }


        if (car.isCarisBig()) { // 대형차라면
            for (ParkingSpace space : parkingLotList) { // 일반주차장에 주차
                if (space.isCheckLotSpace()) { // 주차공간이 비어있다면
                    parkVehicle(car, space); // 주차
                    parkingLot.lotCount++;

                    System.out.println("일반주차장에 주차되었습니다. 주차칸 : " + space.getSpaceNum()); // 주차된 주차칸 출력
                    return;
                }
            }
        } else { // 소형차라면
            for (ParkingSpace space : parkingTowerList) { // 주차타워에 주차

                if (space.isCheckTowerSpace()) { // 주차공간이 비어있다면
                    parkVehicle(car, space); // 주차
                    System.out.println("주차타워에 주차되었습니다. 주차칸 : " + space.getSpaceNum()); // 주차된 주차칸 출력
                    parkingLot.towerCount++;
                    return;
                }
                if (space.getParkedCar().getCarNum() == car.getCarNum()) {
                    System.out.println("이미 존재하는 차량입니다.");
                }
            }
        }
        System.out.println("주차장이 가득 찼습니다."); // 주차장이 가득 찼다면 출력
    }

    //    4. 각 주차장에 주차되었다면 마지막에 어느주차장에 어느칸에 주차되었는지 위치를 출력해주기.
    public void parkVehicle(Car car, ParkingSpace space) {
        space.setParkedCar(car);
    }

}

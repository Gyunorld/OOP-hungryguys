package parkingsystem.controller;

import parkingsystem.model.dto.Car;
import parkingsystem.model.dto.ParkingSpace;
import parkingsystem.repos.ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class CarEntry {
    /*
    입차 메소드, 컨트롤러에 생성된 parking space를 인자로 받아서 처리..?

    이하 추형진.
    1. 사용자로부터 차량 정보(번호, isBig 등)를 입력받기.
    2. 입력받은 차량 정보를 바탕으로 Car 객체를 생성.
    3. 차종이 대형이냐 소형이냐에 따라 일반 주차장인지 주차타워인지 결정.
    4. 주차 가능한 공간이 있는지 확인.
    5. ParkingLot과 ParkingTower 클래스의 getAvailableSpots() 메서드를 사용 -> 주차 가능한 공간이 있다면, 해당 공간에 차량 정보를 할당.
     */
    public static final int LARGE_CAR = 1;
    public static final int COMPACT_CAR = 2;
    private ParkingLot parkingLot;

    public CarEntry() {
    }

    public CarEntry(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void parkVehicle() {
        Scanner sc = new Scanner(System.in);

        //1. 사용자로부터 차량 정보(번호, isBig 등)를 입력받기.
        System.out.println("차량 번호를 입력하세요: ");
        int PlateNum = sc.nextInt();
        System.out.print("차량 종류를 입력하세요 (1: 대형, 2: 소형): ");
        int vehicleType = sc.nextInt();

        //2. 입력받은 차량 정보를 바탕으로 Car 객체를 생성.
        Car car = new Car(PlateNum, vehicleType == LARGE_CAR); // 차량 객체 생성

        //3. 차종이 대형이냐 소형이냐에 따라 일반 주차장인지 주차타워인지 결정.
        boolean isCompact = vehicleType == COMPACT_CAR; // 소형 차량인지 확인
        ArrayList<ParkingSpace> parkingSpaces = isCompact ? parkingLot.getParkingTower() : parkingLot.getParkingLot(); // 주차장 객체 생성

        //4. 주차 가능한 공간이 있는지 확인.
        ParkingSpace availableSpace = null; // 주차 가능한 공간이 없다면 null
        for (ParkingSpace space : parkingSpaces) { // 주차장 객체를 순회하며 주차 가능한 공간이 있는지 확인
            if (space.getParkedCar() == null && (!isCompact || space.isAvailable())) { //  코드 해석 : 주차된 차량이 없고, 주차공간이 있으면
                availableSpace = space; // 해당 공간에 주차
                break;
            }
        }

        //5. ParkingLot과 ParkingTower 클래스의 getAvailableSpots() 메서드를 사용 -> 주차 가능한 공간이 있다면, 해당 공간에 차량 정보를 할당.
        if (availableSpace != null) { // 주차 가능한 공간이 있다면, 해당 공간에 차량 정보를 할당
            availableSpace.setParkedCar(car);
            System.out.println("주차 완료");
            System.out.println("주차 위치: " + availableSpace.getSpaceNum());
        } else {
            System.out.println("주차 가능한 공간이 없습니다.");
        }

    }
}

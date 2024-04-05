package parkingsystem.controller;

import parkingsystem.model.dto.ParkingSpace;
import parkingsystem.repos.ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class CarExit {

    /*
    출차 메소드, 컨트롤러에 생성된 parking space를 인자로 받아서 처리..?

    1. 사용자로부터 차량 번호를 입력받기
    2. 입력받은 차량 번호를 이용하여 차량을 찾기
    3-1. 찾은 차량을 초기화한다.
    3-2. 주차자리
     */


    private ParkingLot parkingLot;

    public CarExit() {
    }

    public CarExit(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }


    public String vehicleOut(int plateNum) {

        ArrayList<ParkingSpace> pg  = parkingLot.getParkingLot();
        ArrayList<ParkingSpace> pt  = parkingLot.getParkingTower();


        for (int i = 0; i < pg.size(); i++){
            if (pg.get(i).getParkedCar()==null){
                continue;
            }
            if (plateNum == pg.get(i).getParkedCar().getCarNum()) {
                pg.get(i).setParkedCar(null);
                parkingLot.lotCount--;

                return "일반주차장-" + pg.get(i).getSpaceNum();
            }
        }
        for (int i = 0; i < pt.size(); i++){
            if (pt.get(i).getParkedCar()==null){
                continue;
            }
            if (plateNum == pt.get(i).getParkedCar().getCarNum()) {
                pt.get(i).setParkedCar(null);
                ParkingLot.towerCount--;
                return "주차타워-" + pt.get(i).getSpaceNum();
            }
        }
        return "fail";
    }
}
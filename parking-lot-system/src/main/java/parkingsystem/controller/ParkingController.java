package parkingsystem.controller;

import parkingsystem.model.dto.Car;
import parkingsystem.repos.ParkingLot;

public class ParkingController {

    public ParkingLot pl = new ParkingLot(30, 10);

    CarEntry carEntry = new CarEntry();
    CarExit carExit = new CarExit();

    // 입차, 출차
    public void entry(ParkingLot space, Car car) {
        new CarEntry();
    }

    public void exit(ParkingLot space, Car car) {
        new CarExit();
    }

}

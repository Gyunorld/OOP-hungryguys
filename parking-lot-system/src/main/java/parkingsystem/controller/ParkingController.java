package parkingsystem.controller;

import parkingsystem.model.dto.Car;
import parkingsystem.model.dto.ParkingSpace;
import parkingsystem.repos.ParkingLot;

public class ParkingController {

    public ParkingLot pl = new ParkingLot(10, 5);

    CarEntry carEntry = new CarEntry(pl);
    CarExit carExit = new CarExit(pl);

    // CarEntry 호출
    public void entry() {
        carEntry.entry();
        carEntry.parkCar(carEntry.inputCarInfo());
    }

    // 출차
    public void exit(ParkingLot space, Car car) {
        new CarExit();
    }


}

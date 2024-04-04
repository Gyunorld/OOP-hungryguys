package parkingsystem.controller;

import parkingsystem.model.dto.Car;
import parkingsystem.model.dto.ParkingSpace;
import parkingsystem.repos.ParkingLot;

public class ParkingController {

    public ParkingLot pl = new ParkingLot(10, 5);

    CarEntry carEntry = new CarEntry(pl);
    CarExit carExit = new CarExit(pl);

    // 입차, 출차
    public void entry() {
        carEntry.parkVehicle();
        for(ParkingSpace i : pl.getParkingLot()){
            System.out.println(i);
        }
        System.out.println("----------------------------");
        for(ParkingSpace i : pl.getParkingTower()) {
            System.out.println(i);
        }
    }

    public void exit(ParkingLot space, Car car) {
        new CarExit();
    }

}

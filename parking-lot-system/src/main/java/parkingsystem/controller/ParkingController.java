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
    public String exit(int carNum) {
        String result = carExit.vehicleOut(carNum);

//        for (ParkingSpace i : pl.getParkingLot()) {
//            System.out.println(i);
//        }
//        System.out.println("----------------------------");
//        for (ParkingSpace i : pl.getParkingTower()) {
//            System.out.println(i);
//        }
        return result;
    }

    public String whereIsMyCar(int carNumber) {

        for (ParkingSpace parkingSpace : pl.getParkingLot()) {
            if (parkingSpace.getParkedCar() != null && parkingSpace.getParkedCar().getCarNum() == carNumber) {
                return "일반주차장-" + parkingSpace.getSpaceNum();
            }
        }
        for (ParkingSpace parkingSpace : pl.getParkingTower()) {
            if (parkingSpace.getParkedCar() != null && (parkingSpace.getParkedCar().getCarNum() == carNumber)) {
                return "주차타워-" + parkingSpace.getSpaceNum();
            }
        }
        return "X";
    }
}

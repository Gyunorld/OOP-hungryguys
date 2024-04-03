package parkingsystem.view;

import parkingsystem.controller.ParkingController;
import parkingsystem.model.dto.ParkingSpace;

import java.util.ArrayList;

public class MainMenu {
    ParkingController controller = new ParkingController();
    public void showParkingLotStatus() {
        // controller
        ArrayList<ParkingSpace> parkingLot = controller.pl.getParkingLot();
        for(var space : parkingLot) {
            System.out.println(space);
        }
        
        // tower
        ArrayList<ParkingSpace> parkingTower = controller.pl.getParkingTower();
    }

}

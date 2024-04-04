package parkingsystem.run;

import parkingsystem.controller.*;
import parkingsystem.model.dto.*;
import parkingsystem.repos.ParkingLot;
import parkingsystem.view.MainMenu;

public class Application {

    public static void main(String[] args) {

        MainMenu menu = new MainMenu();

        menu.mainMenu();

//        ParkingLot pl = new ParkingLot(30, 10);

        // 입차 클래스 호출
//        CarEntry carEntry = new CarEntry(pl);
//
//        // 입차
//        carEntry.parkVehicle();



    }
}

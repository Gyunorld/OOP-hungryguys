package parkingsystem.run;

import parkingsystem.repos.ParkingLot;

public class Application {

    public static void main(String[] args) {

//        MainMenu menu = new MainMenu();

        ParkingLot pl = new ParkingLot(30, 10);
        System.out.println(pl.countSpace());
    }
}

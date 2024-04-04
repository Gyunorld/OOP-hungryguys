package parkingsystem.run;

import parkingsystem.controller.*;
import parkingsystem.model.dto.*;
import parkingsystem.repos.ParkingLot;
import parkingsystem.view.MainMenu;

public class Application {

    public static void main(String[] args) {


        MainMenu menu = new MainMenu();
        menu.mainMenu();
    }
}

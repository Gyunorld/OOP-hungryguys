package parkingsystem.view;

import parkingsystem.controller.ParkingController;
import parkingsystem.model.dto.ParkingSpace;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    ParkingController controller = new ParkingController();
    Scanner sc  = new Scanner(System.in);

    public void mainMenu() {

        while(true) {
            textHead();
            printParkingLot();
            System.out.print("""                
                    ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━                   
                                     1. 입차
                                     2. 출차
                                 3. 주자 위치 조회
                                     0. 종료
                    """);
            textTail();

            System.out.print(">> 입력 : ");
            int operator = sc.nextInt();

            switch (operator) {
                case 1:
                    controller.entry();
                    break;
                case 2:
                    carExit();
                    break;
                case 3:
                    whereisMyCar();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다! 다시 입력해주세요.");
            }
        }
    }

    public static void textHead() {
        System.out.println("┏━━━━━━ \uD83C\uDD7F\uFE0F HUNGRY GUYS PARKING LOT ━━━━━━┓");
    }

    public static void textTail() {
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }

    public void carExit() {
        System.out.print("주차하신 차량 번호를 입력해주세요 : ");
        int carNum = sc.nextInt();
        String result = controller.exit(carNum);
        if(result.equals("fail")) {
            System.out.println("입력하신 차량번호에 맞는 차량이 주차장에 없습니다!");
        } else {
            System.out.println("(차량 번호 : " + carNum + " , 주차 위치 : " + result + ") 출차 되었습니다!" );
        }
    }
    public void whereisMyCar() {
        System.out.print("주차하신 차량 번호를 입력해주세요 : ");
        int carNum = sc.nextInt();
        String result = controller.whereIsMyCar(carNum);
        if(result.equals("X")) {
            System.out.println("입력하신 차량번호에 맞는 차량이 주차장에 없습니다!");
        } else {
            System.out.println("입력하신 차량번호에 맞는 차량은 " + result + " 에 있습니다.");
        }
    }

    public void printParkingLot() {
        String[] leftSpace = parkingLotUI().split("\n");
        String[] rightSpace = parkingTowerUI().split("\n");
        int maxLength = Math.max(leftSpace.length, rightSpace.length);
        int numSpaces = 10;

        for (int i = 0; i < maxLength; i++) {

            String leftLine = i < leftSpace.length ? leftSpace[i] : "";
            String rightLine = i < rightSpace.length ? rightSpace[i] : "";

            System.out.printf("   %s%" + numSpaces + "s%s%n", leftLine, "", rightLine);
        }
    }

    public String parkingLotUI() {
        String ui = "[ParkingLot]\n";
        ArrayList<ParkingSpace> parkingLot = controller.pl.getParkingLot();

        for (int i = 0; i < parkingLot.size(); i++) {

            if(i % 2 == 0 && i != 0) ui += "\n";

            if(parkingLot.get(i).getParkedCar() == null)
                ui += "["+ (i + 1) + "]" + "\uD83D\uDFE9";
            else
                ui += "["+ (i + 1) + "]" + "\uD83D\uDE99";

            if(i != 8) ui += "   ";
            else ui += "  ";
        }
        return ui;
    }
    public String parkingTowerUI() {
        String ui = "[ParkingTower]\n";
        ArrayList<ParkingSpace> parkingTower = controller.pl.getParkingTower();

        for (int i = parkingTower.size() - 1; i >= 0; i--) {
            if(parkingTower.get(i).getParkedCar() == null)

                ui += "["+ (i + 1) + "]" + "\uD83D\uDFE9" + "\n";
            else
                ui += "["+ (i + 1) + "]" + "\uD83D\uDE99" + "\n";

        }
        return ui;
    }
}

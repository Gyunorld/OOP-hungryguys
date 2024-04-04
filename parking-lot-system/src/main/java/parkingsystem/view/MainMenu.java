package parkingsystem.view;

import parkingsystem.controller.ParkingController;
import parkingsystem.model.dto.ParkingSpace;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    ParkingController controller = new ParkingController();
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {

        while(true) {
            System.out.println();
            textHead();
            System.out.print("""
                                    
                                   1. 입차
                                   2. 출차
                               3. 차량 위치 조회
                                   0. 종료
                                   
                    """);
            textTail();
            System.out.print(">> 입력 : ");
            int operator = sc.nextInt();

            switch (operator) {
                case 1:
                    carEntry();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다! 다시 입력해주세요.");
            }
        }
    }

    public void carEntry() {
        controller.entry();
    }

    public void carExit() {

    }

    public static void textHead() {
        System.out.println("┏━━━━━🅿️HUNGRY GUYS PARKING LOT ━━━━━┓");
    }
    public static void textTail() {
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }

}

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
            System.out.println("""
                                    
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
                    break;
                case 3:
                    break;
                case 0:
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

}

package parkingsystem.repos;

import parkingsystem.model.dto.ParkingSpace;

import java.util.ArrayList;

public class ParkingLot {

    private ArrayList<ParkingSpace> parkingLot = null;
    private ArrayList<ParkingSpace> parkingTower = null;

    public ParkingLot(int parkNum, int towerNum) {

        parkingLot = new ArrayList<>(parkNum);
        parkingTower = new ArrayList<>(towerNum);

        for (int i = 0; i < parkNum; i++) {
            parkingLot.add(new ParkingSpace(i + 1, true));
        }
        for (int i = 0; i < towerNum; i++) {
            parkingTower.add(new ParkingSpace(i + 1, false));
        }
    }

    public ArrayList<ParkingSpace> getParkingLot() {
        return parkingLot;
    }

    public ArrayList<ParkingSpace> getParkingTower() {
        return parkingTower;
    }

    //    // 전체 자리 여석 조회
//    public int countSpace() {
//        int cnt = 0;
//
//        for(ParkingSpace i : parkingLot) {
//            if(i.isCheckSpace())
//                cnt++;
//        }
//        for(ParkingSpace i : parkingTower) {
//            if(i.isCheckSpace())
//                cnt++;
//        }
//
//        return cnt;
//    }
//
//    // 3. 차량번호
    /*
     * find my car
     * */
    public String whereIsMyCar(int carNumber) {
        for (ParkingSpace parkingSpace : parkingLot) {
            if (parkingSpace.getSpaceNum() == carNumber) {
                return "일반주차장-" + parkingSpace.getSpaceNum();
            }
        }
        for (ParkingSpace parkingSpace : parkingTower) {
            if (parkingSpace.getSpaceNum() == carNumber) {
                return "주차타워-" + parkingSpace.getSpaceNum();
            }
        }
        return "X";
    }
}

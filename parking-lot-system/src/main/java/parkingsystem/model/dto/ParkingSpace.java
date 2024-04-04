package parkingsystem.model.dto;

public class ParkingSpace {

    private int spaceNum;           // 주차 자리 번호

    private Car parkedCar;          // null = 주차안된 빈칸
    private boolean isAvailable;    // 대형 가능 여부

    public ParkingSpace() {
    }

    public ParkingSpace(int spaceNum, boolean isAvailable) {
        this.spaceNum = spaceNum;
        this.isAvailable = isAvailable;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }

    public int getSpaceNum() {
        return spaceNum;
    }

    public void setSpaceNum(int spaceNum) {
        this.spaceNum = spaceNum;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "spaceNum=" + spaceNum +
                ", parkedCar=" + parkedCar +
                ", isAvailable=" + isAvailable +
                '}';
    }
    public boolean isCheckSpace() { // 주차 가능한지 확인하는 부분
        return isAvailable && parkedCar == null;
    }
}

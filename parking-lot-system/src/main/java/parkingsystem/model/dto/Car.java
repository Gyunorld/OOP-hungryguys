package parkingsystem.model.dto;

public class Car {

    private int carNum;
    private String carType;

    public Car() {
    }

    public Car(int carNum, String carType) {
        this.carNum = carNum;
        this.carType = carType;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNum=" + carNum +
                ", carType='" + carType + '\'' +
                '}';
    }
}

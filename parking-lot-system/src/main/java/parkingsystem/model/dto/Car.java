package parkingsystem.model.dto;

public class Car {

    private int carNum;
    private boolean carisBig;

    public Car() {
    }

    public Car(int carNum, boolean isBig) {
        this.carNum = carNum;
        this.carisBig = isBig;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public boolean getCarType() {
        return carisBig;
    }

    public void setCarType(boolean carType) {
        this.carisBig = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNum=" + carNum +
                ", carisBig='" + carisBig + '\'' +
                '}';
    }
}

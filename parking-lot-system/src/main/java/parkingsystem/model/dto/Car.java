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

    public boolean isCarisBig() {
        return carisBig;
    }

    public void setCarisBig(boolean carisBig) {
        this.carisBig = carisBig;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNum=" + carNum +
                ", carisBig='" + carisBig + '\'' +
                '}';
    }
}

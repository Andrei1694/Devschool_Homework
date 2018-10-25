package Inheritence;

public class FiatPunto extends Car {

    private boolean abs;
    private boolean heatInSeat;

    FiatPunto(){
        this.setAbs(true);
        this.setHeatInSeat(true);
        this.setCurrentGear(1);
        this.setCurrentSpeed(5);
        System.out.println("Fiat is running.");
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isHeatInSeat() {
        return heatInSeat;
    }

    public void setHeatInSeat(boolean heatInSeat) {
        this.heatInSeat = heatInSeat;
    }
}

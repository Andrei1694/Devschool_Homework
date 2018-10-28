package Tema1.Inheritence;

public class Vehicle {
    private int currentSpeed;
    private int currentGear;
    private boolean handSteering;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
    }
}

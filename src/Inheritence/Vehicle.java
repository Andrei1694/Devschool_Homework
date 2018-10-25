package Inheritence;

public class Vehicle {
    int currentSpeed;
    int currentGear;
    boolean handSteering;

    void startVehicle(){
        this.currentGear += 1;
        this.currentSpeed += 10;
    }

}

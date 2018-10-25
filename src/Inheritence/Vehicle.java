package Inheritence;

public class Vehicle {
    int currentSpeed;
    int currentGear;
    boolean handSteering;

    void startCar(){
        this.changingGears(1);
        this.currentSpeed += 10;
    }
    void changingGears(int gear){
        this.currentGear = gear;
    }

    void increseSpeed(int newSpeed){
        switch (currentSpeed){
            case 30: this.changingGears(2);
                break;
            case 50: this.changingGears(3);
                break;
            case 70: this.changingGears(4);
                break;
            case 100: this.changingGears(5);
                break;
        }
        this.currentSpeed += newSpeed;
    }

    void decreseSpeed(int newSpeed){
        this.currentSpeed -= newSpeed;
    }

    void move(){
        System.out.println("You're moving with the currentSpeed of "+this.currentSpeed);
    }
}

package Inheritence;

public class Car extends Vehicle {

    public Car(){
        this.setHandSteering(true);
        this.setCurrentGear(1);
        this.setCurrentSpeed(5);
        System.out.println("The car started.");
    }

    void changingGears(int gear){
        this.setCurrentGear(gear);
    }

    void increseSpeed(int newSpeed){
        switch (this.getCurrentSpeed()){
            case 30: this.changingGears(2);
                break;
            case 50: this.changingGears(3);
                break;
            case 70: this.changingGears(4);
                break;
            case 100: this.changingGears(5);
                break;
        }
        this.setCurrentSpeed(this.getCurrentSpeed() + newSpeed);
    }

    void decreseSpeed(int newSpeed){
        this.setCurrentSpeed(this.getCurrentSpeed() - newSpeed);
    }

    void move(){
        System.out.println("You're moving with the currentSpeed of "+this.getCurrentSpeed());
    }
}

package Polymorphism;

public class Car {


    public boolean engine;
    public int numberOfCylindres;
    public String cylinderName;
    public int wheels;

    public Car(int numberOfCylindres, String cylinderName) {
        this.numberOfCylindres = numberOfCylindres;
        this.cylinderName = cylinderName;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumberOfCylindres() {
        return numberOfCylindres;
    }

    public String getCylinderName() {
        return cylinderName;
    }

    public int getWheels() {
        return wheels;
    }
}

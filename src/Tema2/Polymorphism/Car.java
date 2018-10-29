package Tema2.Polymorphism;

public class Car {


    public boolean engine;
    public int numberOfCylindres;
    public String name;
    public int wheels;

    public Car(int numberOfCylindres, String name) {
        this.numberOfCylindres = numberOfCylindres;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        System.out.println(this.getName() + " engine is running.");
        return engine;
    }

    public int getNumberOfCylindres() {
        System.out.println(this.getName() + " has " + this.numberOfCylindres + " cylindres");
        return numberOfCylindres;
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }

    public int getWheels() {
        System.out.println(this.getName() + " has" + this.wheels + " cylindres");
        return wheels;
    }
}

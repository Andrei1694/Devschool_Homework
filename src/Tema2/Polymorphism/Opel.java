package Tema2.Polymorphism;

public class Opel extends Car {
    public Opel(int numberOfCylindres, String name) {
        super(numberOfCylindres, name);
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

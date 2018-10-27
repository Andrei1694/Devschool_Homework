import BarkingDog.Dog;
import Inheritence.Car;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car();  Inheritence homework
        Dog dog = new Dog();
        System.out.println(dog.bark(true, 1));
        System.out.println(dog.bark(false, 2));
        System.out.println(dog.bark(true, 8));
        System.out.println(dog.bark(true, -1));

    }
}

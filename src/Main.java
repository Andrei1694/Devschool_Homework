import Tema2.Polymorphism.Car;
import Tema2.Polymorphism.Fiat;
import Tema2.Polymorphism.Opel;

public class Main {

    public static void main(String[] args) {
////        Car car = new Car();  Tema1.Inheritence homework
//
////        Dog Barking Homework
////        Dog dog = new Dog();
////        System.out.println(dog.bark(true, 1));
////        System.out.println(dog.bark(false, 2));
////        System.out.println(dog.bark(true, 8));
////        System.out.println(dog.bark(true, -1));
//
////        Tema1.EqualSumChecker equalSumChecker = new Tema1.EqualSumChecker();
////        System.out.println(equalSumChecker.hasEqualsSum(1,1,1));
////        System.out.println(equalSumChecker.hasEqualsSum(1,1,2));
////        System.out.println(equalSumChecker.hasEqualsSum(1,-1,0));
//
//          Calculator c = new Calculator();
////        c.printYearsAbdDays(525600 );
////        c.printYearsAbdDays(1051200);
////        c.printYearsAbdDays(561600);
//          c.printYearsAbdDays(525600);
//          c.printYearsAbdDays(1051200);
//          c.printYearsAbdDays(561600);

        //Tema2

        Car car1 = new Fiat(4, "Punto");
        car1.getName();
        Car car2 = new Opel(3, "Vectra");
        car2.getName();
    }
}

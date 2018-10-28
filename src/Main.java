import BurgerApp.Addition;
import BurgerApp.BasicBurger;


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
//        Calculator c = new Calculator();
////        c.printYearsAbdDays(525600 );
////        c.printYearsAbdDays(1051200);
////        c.printYearsAbdDays(561600);
//        c.printYearsAbdDays(525600);
//        c.printYearsAbdDays(1051200);
//        c.printYearsAbdDays(561600);

        BasicBurger b1 = new BasicBurger("alba", "vita", 2.4f);
        b1.addAddition(new Addition(Addition.AdditionName.LETTUCE));
        b1.addAddition(new Addition(Addition.AdditionName.TOMATO));
        b1.addAddition(new Addition(Addition.AdditionName.ONION));
        b1.addAddition(new Addition(Addition.AdditionName.OREGANO));
        b1.addAddition(new Addition(Addition.AdditionName.CARROT));
        b1.showTotalPrice();
    }
}

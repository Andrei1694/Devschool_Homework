package BurgerApp;

import java.util.ArrayList;

public class BasicBurger {

    String breadRollType;
    String meat;
    String name;
    float basePrice;
    ArrayList<Addition> additions;
    int numberOfAdditions;
    float finalPrice;

    public BasicBurger() {

    }
    public BasicBurger(String breadRollType, String meat, float price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = price;
        this.name = "Basic Burger";
        this.finalPrice = price;
        this.numberOfAdditions = 0;
        this.additions = new ArrayList<>();

    }

    public void addAddition(Addition addition) {
        if (additions.size() < 4) {
            switch (addition.additionName) {
                case CARROT:
                    this.additions.add(addition);
                    this.finalPrice += addition.price;
                    break;
                case TOMATO:
                    this.additions.add(addition);
                    this.finalPrice += addition.price;
                    break;
                case ONION:
                    this.additions.add(addition);
                    this.finalPrice += addition.price;
                    break;
                case LETTUCE:
                    this.additions.add(addition);
                    this.finalPrice += addition.price;
                    break;
            }
            this.numberOfAdditions++;
            System.out.println(addition.additionName + " added, you have " + this.numberOfAdditions + " additions.");
        } else {
            System.out.println(addition.additionName + " can't be added, you can have just 4 additions.");
        }
    }

    public void showTotalPrice() {
        System.out.println();
        System.out.println("////////////////////////////////////////////////");
        System.out.println("This burger " + this.name + " price is: " + this.basePrice);
        for (Addition a : this.additions
        ) {
            System.out.println("////////////////////////////////////////////////");
            System.out.println(a.additionName + " " + a.price);
        }
        System.out.println("////////////////////////////////////////////////");
        System.out.println("Total price: " + this.finalPrice);
        System.out.println("////////////////////////////////////////////////");
    }
}

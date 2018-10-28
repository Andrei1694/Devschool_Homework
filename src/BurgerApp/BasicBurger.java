package BurgerApp;

import java.util.ArrayList;

public class BasicBurger {

    String breadRollType;
    String meat;
    String name;
    float basePrice;
    ArrayList<Addition> additions;
    int numberOfAdditions;
    float totalPrice;

    public BasicBurger(String breadRollType, String meat, float price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = price;
        this.totalPrice = this.basePrice;
        additions = new ArrayList<>();
        numberOfAdditions = 0;
    }

    public void addAddition(Addition addition) {

        switch (addition.additionName) {
            case CARROT:
                this.additions.add(addition);
                this.totalPrice += addition.price;
                break;
            case TOMATO:
                this.additions.add(addition);
                this.totalPrice += addition.price;
                break;
            case ONION:
                this.additions.add(addition);
                this.totalPrice += addition.price;
                break;
            case LETTUCE:
                this.additions.add(addition);
                this.totalPrice += addition.price;
                break;

        }

        this.numberOfAdditions++;
    }

    public void setName() {
        this.name = "Basic Burger";
    }

    public void showTotalPrice() {
        System.out.println("This burger price is: " + this.basePrice);
        for (Addition a : this.additions
        ) {
            System.out.println(a.additionName + " " + a.price);
        }
        System.out.println(this.totalPrice);
    }
}

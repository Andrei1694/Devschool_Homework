package Tema2.BurgerApp;

import java.util.ArrayList;

public class BasicBurger {

    String breadRollType;
    String meat;
    String name;
    float basePrice;
    ArrayList<Addition> additions;
    int numberOfAdditions;
    int additionsLimit;
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
        this.additionsLimit = 4;
        this.additions = new ArrayList<>();
    }

    public void addAddition(Addition addition) {
        if (this.numberOfAdditions < additionsLimit && addition.getAdditionName() != null) {
            this.additions.add(addition);
            this.finalPrice += addition.getPrice();
            this.numberOfAdditions++;
            System.out.println(addition.getAdditionName() + " added, you have " + this.numberOfAdditions + " additions.");
        } else if (addition.getAdditionName() == null) {
            System.out.println("Sdasd");
        } else {
            System.out.println(addition.getAdditionName() + " can't be added, you can have just 4 additions.");
        }
    }

    public void showTotalPrice() {
        System.out.println();
        System.out.println("////////////////////////////////////////////////");
        System.out.println(this.name + ", bread roll: " + this.breadRollType
                + ", meat:" + this.meat + " price is: " + this.basePrice);
        for (Addition a : this.additions
        ) {
            System.out.println("////////////////////////////////////////////////");
            System.out.println(this.additions.indexOf(a) + 1 + ") " + a.getAdditionName() + " " + a.getPrice());
        }
        System.out.println("////////////////////////////////////////////////");
        System.out.println("Total price: " + this.finalPrice);
        System.out.println("////////////////////////////////////////////////");
    }
}

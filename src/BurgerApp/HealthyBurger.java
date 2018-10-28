package BurgerApp;

import java.util.ArrayList;

public class HealthyBurger extends BasicBurger {

    public HealthyBurger(String breadRollType, String meat, float price) {
        this.breadRollType = "brown rye bread roll";
        this.meat = meat;
        this.basePrice = price;
        this.name = "Healthy Burger";
        this.finalPrice = price;
        this.numberOfAdditions = 0;
        this.additions = new ArrayList<>();
        this.addAddition(new Addition(Addition.AdditionName.ONION));
        this.addAddition(new Addition(Addition.AdditionName.GARLIC));
    }

    public void addAddition(Addition addition) {
        if (additions.size() < 6) {
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
                case GARLIC:
                    this.additions.add(addition);
                    this.finalPrice += addition.price;
                    break;
                case OREGANO:
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
}

package Tema2.BurgerApp;

import java.util.ArrayList;

public class DeluxeHamburger extends BasicBurger {

    public DeluxeHamburger(String meat, float price) {
        this.breadRollType = "brown rye bread roll";
        this.meat = meat;
        this.basePrice = price;
        this.name = "Deluxe Burger";
        this.additionsLimit = 6;
        this.numberOfAdditions = 0;
        this.additions = new ArrayList<>();
        this.additions.add(new Addition("CHIPS"));
        this.additions.add(new Addition("DRINK"));
        this.finalPrice = price;
    }

    @Override
    public void addAddition(Addition addition) {
        System.out.println("You can't add anymore items");
    }
}

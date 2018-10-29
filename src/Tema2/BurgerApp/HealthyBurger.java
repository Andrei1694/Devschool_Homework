package Tema2.BurgerApp;

import java.util.ArrayList;

public class HealthyBurger extends BasicBurger {

    public HealthyBurger(String meat, float price, Addition additionOne, Addition additionTwo) {
        this.breadRollType = "brown rye bread roll";
        this.meat = meat;
        this.basePrice = price;
        this.name = "Healthy Burger";
        this.additionsLimit = 6;
        this.numberOfAdditions = 0;
        this.additions = new ArrayList<>();
        this.finalPrice = price;
    }

    @Override
    public void addAddition(Addition addition) {
        if (this.numberOfAdditions < additionsLimit && addition.getAdditionName() != null) {
            this.additions.add(addition);
            if (this.numberOfAdditions >= 2)
                this.finalPrice += addition.getPrice();
            this.numberOfAdditions++;
            System.out.println(addition.getAdditionName() + " added, you have " + this.numberOfAdditions + " additions.");
        } else if (addition.getAdditionName() == null) {
            System.out.println("Sdasd");
        } else {
            System.out.println(addition.getAdditionName() + " can't be added, you can have just 4 additions.");
        }
    }
}

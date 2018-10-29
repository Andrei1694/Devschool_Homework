package Tema2.BurgerApp;

public class Addition {

    private AdditionName additionName;
    private double price;

    public Addition(String additionName) {
        switch (additionName) {
            case "CARROT":
                this.additionName = AdditionName.CARROT;
                this.price = 0.1;
                break;
            case "TOMATO":
                this.additionName = AdditionName.TOMATO;
                this.price = 0.9;
                break;
            case "ONION":
                this.additionName = AdditionName.ONION;
                this.price = 0.4;
                break;
            case "LETTUCE":
                this.additionName = AdditionName.LETTUCE;
                this.price = 0.6;
                break;
            case "OREGANO":
                this.additionName = AdditionName.OREGANO;
                this.price = 0.3;
                break;
            case "GARLIC":
                this.additionName = AdditionName.GARLIC;
                this.price = 0.2;
                break;
            case "DRINK":
                this.additionName = AdditionName.DRINK;
                this.price = 2;
                break;
            case "CHIPS":
                this.additionName = AdditionName.CHIPS;
                this.price = 1.5;
                break;
        }
    }

    public AdditionName getAdditionName() {
        return additionName;
    }

    public double getPrice() {
        return price;
    }

    public enum AdditionName {
        ONION, LETTUCE, TOMATO, CARROT, OREGANO, GARLIC, CHIPS, DRINK
    }
}


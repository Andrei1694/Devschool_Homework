package BurgerApp;

public class Addition {

    AdditionName additionName;
    double price;

    public Addition(AdditionName additionName) {
        this.additionName = additionName;
        this.setPrice();
    }

    public enum AdditionName {
        ONION, LETTUCE, TOMATO, CARROT, OREGANO, GARLIC, CHIPS, DRNIK
    }

    private void setPrice() {
        switch (this.additionName) {
            case CARROT:
                this.price = 0.1;
                break;
            case TOMATO:
                this.price = 0.9;
                break;
            case ONION:
                this.price = 0.4;
                break;
            case LETTUCE:
                this.price = 0.6;
                break;
            case OREGANO:
                this.price = 0.3;
                break;
            case GARLIC:
                this.price = 0.2;
                break;
            case DRNIK:
                this.price = 2;
                break;
            case CHIPS:
                this.price = 1.5;
                break;
        }
    }
}

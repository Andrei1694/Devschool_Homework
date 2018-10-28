package Composition;

import java.util.ArrayList;

public class LivingRoom implements Room {

    int width, length;
    ArrayList<Furniture> f = new ArrayList<>();
    ConstructionPart window_1 = new ConstructionPart();
    ConstructionPart window_2 = new ConstructionPart();
    ConstructionPart door = new ConstructionPart();

    public LivingRoom(int width, int length, ConstructionPart window_1, ConstructionPart window_2, ConstructionPart door) {
        this.width = width;
        this.length = length;
        this.window_1 = window_1;
        this.window_2 = window_2;
        this.door = door;
    }

    @Override
    public int calculateArea(int width, int length) {
        return this.length * this.width;
    }

    @Override
    public Furniture addFurniture(String name, int positionX, int positionY,
                                  int width, int length, int hight, String material) {
        Furniture f = new Furniture(name, positionX, positionY, width, length, hight, material);
        return f;
    }


}

package Composition;

public interface Room {
    int calculateArea(int width, int length);

    Furniture addFurniture(String name, int positionX, int positionY,
                           int width, int length, int hight, String material);

}
package Composition;

public class Furniture {
    private String name;
    private int positionX;
    private int positionY;
    private int width;
    private int length;
    private int hight;
    private String material;

    public Furniture(String name, int positionX, int positionY, int width, int length, int hight, String material) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.length = length;
        this.hight = hight;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

package net.mytrofanov.composition.room;

public class Door {
    private Dimension dimension;
    private String color;
    private String materialType;
    private boolean isOpened;
    private boolean isLocked;

    public Door(Dimension dimension, String color, String materialType) {
        this.dimension = dimension;
        this.color = color;
        this.materialType = materialType;
        this.isOpened = false;
        this.isLocked = false;
    }

    public void lock() {
        System.out.println("Locking the door");
        isLocked = true;
    }

    public void open() {
        System.out.println("Opening the door");
        isOpened = true;
    }

    public void close() {
        System.out.println("Closing the door");
        isOpened = false;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public boolean isLocked() {
        return isLocked;
    }
}

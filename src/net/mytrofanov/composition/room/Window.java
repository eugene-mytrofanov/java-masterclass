package net.mytrofanov.composition.room;

public class Window {
    private Dimension dimension;
    private String materialType;
    private boolean isOpened;
    private boolean isCurtainsOpened;

    public Window(Dimension dimension, String materialType) {
        this.dimension = dimension;
        this.materialType = materialType;
        this.isOpened = false;
        this.isCurtainsOpened = true;
    }

    public void openCurtains() {
        System.out.println("Opening the curtains");
        isCurtainsOpened = true;
    }

    public void closeCurtains() {
        System.out.println("Closing the curtains");
        isCurtainsOpened = false;
    }

    public void open() {
        System.out.println("Opening the window");
        isOpened = true;
    }

    public void close() {
        System.out.println("Closing the window");
        isOpened = false;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getMaterialType() {
        return materialType;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public boolean isCurtainsOpened() {
        return isCurtainsOpened;
    }
}

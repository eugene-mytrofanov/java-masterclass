package net.mytrofanov.composition.pc;

public class Monitor {
    private String model;
    private String manufacter;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String manufacter, int size, Resolution resolution) {
        this.model = model;
        this.manufacter = manufacter;
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in " + color + " color");
    }

    public String getModel() {
        return model;
    }

    public String getManufacter() {
        return manufacter;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}

package net.mytrofanov.composition.pc;

public class Motherboard {
    private String model;
    private String manufacter;
    private int ramSlots;
    private int graphicCardSlots;
    private double biosVersion;

    public Motherboard(String model, String manufacter, int ramSlots, int graphicCardSlots, double biosVersion) {
        this.model = model;
        this.manufacter = manufacter;
        this.ramSlots = ramSlots;
        this.graphicCardSlots = graphicCardSlots;
        this.biosVersion = biosVersion;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is running");
    }

    public String getModel() {
        return model;
    }

    public String getManufacter() {
        return manufacter;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getGraphicCardSlots() {
        return graphicCardSlots;
    }

    public double getBiosVersion() {
        return biosVersion;
    }
}

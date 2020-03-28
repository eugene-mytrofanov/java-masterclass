package net.mytrofanov.composition.room;

public class Sofa {
    private Dimension size;
    private String type;
    private int cushions;
    private boolean isLaidOut;

    public Sofa(Dimension size, String type, int cushions) {
        this.size = size;
        this.type = type;
        this.cushions = cushions;
        this.isLaidOut = false;
    }

    public void laidOut() {
        System.out.println("Sofa is ready for sleeping");
        isLaidOut = true;
    }

    public Dimension getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public int getCushions() {
        return cushions;
    }

    public boolean isLaidOut() {
        return isLaidOut;
    }
}

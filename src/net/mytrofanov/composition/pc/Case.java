package net.mytrofanov.composition.pc;

public class Case {
    private int height;
    private int width;
    private int depth;
    private int powerSupply;

    public Case(int height, int width, int depth, int powerSupply) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button is pressed");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getPowerSupply() {
        return powerSupply;
    }
}

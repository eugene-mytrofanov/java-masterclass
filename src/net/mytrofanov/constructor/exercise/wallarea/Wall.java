package net.mytrofanov.constructor.exercise.wallarea;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = (width > 0) ? width : 0;
        this.height = (height > 0) ? height : 0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = (width > 0) ? width : 0;
    }

    public void setHeight(double heigth) {
        this.height = (heigth > 0) ? heigth : 0;
    }

    public double getArea() {
        return this.width * this.height;
    }
}

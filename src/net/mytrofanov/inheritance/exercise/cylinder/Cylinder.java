package net.mytrofanov.inheritance.exercise.cylinder;

import net.mytrofanov.inheritance.exercise.cylinder.Circle;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > 0 ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}

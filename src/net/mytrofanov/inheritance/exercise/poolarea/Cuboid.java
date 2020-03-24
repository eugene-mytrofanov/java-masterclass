package net.mytrofanov.inheritance.exercise.poolarea;

class Cuboid extends Rectangle {

    private double height;

    Cuboid(double width, double lenght, double height) {
        super(width, lenght);
        this.height = height > 0 ? height : 0;
    }

    double getVolume() {
        return getHeight() * super.getArea();
    }

    double getHeight() {
        return height;
    }
}

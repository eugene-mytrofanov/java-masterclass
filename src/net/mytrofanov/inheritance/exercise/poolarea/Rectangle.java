package net.mytrofanov.inheritance.exercise.poolarea;

class Rectangle {
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    double getArea() {
        return getWidth() * getLength();
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }
}

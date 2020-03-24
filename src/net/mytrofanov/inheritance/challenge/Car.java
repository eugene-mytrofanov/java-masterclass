package net.mytrofanov.inheritance.challenge;

public class Car extends Vehicle {

    private int wheels;
    private int gears;
    private int doors;
    private boolean isManual;

    private int currentGear;
    private int yearOfIssue;

    public Car(String name, String size, int wheels, int gears, int doors, boolean isManual, int yearOfIssue) {
        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
        this.yearOfIssue = yearOfIssue;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Change velocity " + speed + " at direction " + direction);
    }
}

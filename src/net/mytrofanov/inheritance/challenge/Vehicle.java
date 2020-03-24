package net.mytrofanov.inheritance.challenge;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + direction + " degrees");
    }

    void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + velocity + " at direction " + direction);
    }

    void stop() {
        this.currentVelocity = 0;
        System.out.println("Vehicle.stop(): The vehicle is slowing down");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

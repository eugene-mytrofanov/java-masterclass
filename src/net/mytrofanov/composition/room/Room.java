package net.mytrofanov.composition.room;

public class Room {
    private Door door;
    private Window window;
    private Lamp lamp;
    private Sofa sofa;

    public Room(Door door, Window window, Lamp lamp, Sofa sofa) {
        this.door = door;
        this.window = window;
        this.lamp = lamp;
        this.sofa = sofa;
    }

    public void getReadyForSleep() {
        window.closeCurtains();
        door.lock();
        sofa.laidOut();
        lamp.turnOff();
        System.out.println("Ready to sleep");
    }

    public void getReadyForAWalk() {
        window.close();
        door.open();
        door.close();
    }

    public Door getDoor() {
        return door;
    }

    private Window getWindow() {
        return window;
    }

    public Lamp getLamp() {
        return lamp;
    }

    private Sofa getSofa() {
        return sofa;
    }
}

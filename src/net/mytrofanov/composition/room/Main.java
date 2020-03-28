package net.mytrofanov.composition.room;

public class Main {
    public static void main(String[] args) {
        Dimension doorDimension = new Dimension(100, 220, 20);
        Dimension windowDimension = new Dimension(80, 130, 20);
        Dimension sofaDimension = new Dimension(200, 50, 60);

        Door door = new Door(doorDimension, "Brown", "Wood");
        Window window = new Window(windowDimension, "Plastic");
        Lamp lamp = new Lamp(5, "Warm");
        Sofa sofa = new Sofa(sofaDimension, "Classic", 3);

        Room room = new Room(door, window, lamp, sofa);
        System.out.println("Is door opened? " + room.getDoor().isOpened());
        System.out.println("Number of bulbs in lamp is " + room.getLamp().getBulbs());

        room.getReadyForSleep();
    }
}

package net.mytrofanov.composition.room;

public class Lamp {
    private int bulbs;
    private String typeOfLigth;
    private boolean isOn;

    public Lamp(int bulbs, String typeOfLigth) {
        this.bulbs = bulbs;
        this.typeOfLigth = typeOfLigth;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The lamp is shining");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The lamp is off");
    }

    public int getBulbs() {
        return bulbs;
    }

    public String getTypeOfLigth() {
        return typeOfLigth;
    }

    public boolean isOn() {
        return isOn;
    }
}

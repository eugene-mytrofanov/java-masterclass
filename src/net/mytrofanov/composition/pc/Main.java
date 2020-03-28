package net.mytrofanov.composition.pc;

public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("2410IPS", "Dell", 24, resolution);
        Motherboard motherboard = new Motherboard("AN9-E34", "Asus", 4, 2, 1.05);
        Case theCase = new Case(240, 80, 55, 350);

        PC pc = new PC(motherboard, monitor, theCase);
        pc.powerUp();
    }
}

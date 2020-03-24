package net.mytrofanov.inheritance.challenge;

public class Main {
    public static void main(String[] args) {
        SkodaOctavia sk = new SkodaOctavia(2015, 8, 24);
        sk.steer(45);
        sk.accelerate(30);
        sk.accelerate(20);
        sk.accelerate(-45);
        sk.accelerate(-5);
    }
}

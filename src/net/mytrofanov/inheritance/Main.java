package net.mytrofanov.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 25);
        animal.eat();

        Dog dog = new Dog("Haski", 4, 20, 2, 4, 1, 18, "Long fur");
        dog.eat();
        dog.walk();
    }
}

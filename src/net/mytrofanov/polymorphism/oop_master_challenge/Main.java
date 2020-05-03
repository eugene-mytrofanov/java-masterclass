package net.mytrofanov.polymorphism.oop_master_challenge;

import net.mytrofanov.polymorphism.oop_master_challenge.additions.*;

public class Main {
    public static void main(String[] args) {
        BaseHamburger baseHamburger = new BaseHamburger("First", "Hot Dog Bun", "Bacon", 100);
        baseHamburger.setCheese(new Cheese(10.5));
        baseHamburger.setLettuce(new Lettuce(14.5));
        System.out.println("Burger price with additionals is " + baseHamburger.getBurgerInfo());
        System.out.println("-----------------");

        HealthyBurger hb = new HealthyBurger("Fitness Burger", "fish", 125);
        hb.setCheese(new Cheese(11.75));
        hb.setCorn(new Corn(10.25));
        hb.setPepper(new Pepper(12.25));
        System.out.println("Burger price with additionals is " + hb.getBurgerInfo());
        System.out.println("-----------------");

        DeluxeHamburger dh = new DeluxeHamburger( "French chiabatta", 175);
        System.out.println("Burger price with additionals is " + dh.getBurgerInfo());
    }
}

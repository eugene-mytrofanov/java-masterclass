package net.mytrofanov.polymorphism.oop_master_challenge;

import net.mytrofanov.polymorphism.oop_master_challenge.additions.*;

public class DeluxeHamburger extends BaseHamburger {

    ChipsAndDrinks chipsAndDrinks;

    public DeluxeHamburger(String breadRollType, int price) {
        super("Deluxe", breadRollType, "Sausage and Bacon", price);
        this.chipsAndDrinks = new ChipsAndDrinks(0);
    }

    @Override
    public void setCheese(Cheese cheese) {
        System.out.println("Cannot add this");
    }

    @Override
    public void setTomato(Tomato tomato) {
        System.out.println("Cannot add this");
    }

    @Override
    public void setLettuce(Lettuce lettuce) {
        System.out.println("Cannot add this");
    }

    @Override
    public void setCarrot(Carrot carrot) {
        System.out.println("Cannot add this");
    }
}


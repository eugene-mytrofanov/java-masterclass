package net.mytrofanov.polymorphism.oop_master_challenge;

import net.mytrofanov.polymorphism.oop_master_challenge.additions.Carrot;
import net.mytrofanov.polymorphism.oop_master_challenge.additions.Cheese;
import net.mytrofanov.polymorphism.oop_master_challenge.additions.Lettuce;
import net.mytrofanov.polymorphism.oop_master_challenge.additions.Tomato;

public class BaseHamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private Cheese cheese;
    private Tomato tomato;
    private Lettuce lettuce;
    private Carrot carrot;

    public BaseHamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public void setLettuce(Lettuce lettuce) {
        this.lettuce = lettuce;
    }

    public void setCarrot(Carrot carrot) {
        this.carrot = carrot;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public double getBurgerInfo() {
        double hamburgerPrice = this.getPrice();
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll," + " price is " + this.price);

        if (this.cheese != null) {
            hamburgerPrice += cheese.getPrice();
            System.out.println("Added cheese for an extra " + cheese.getPrice());
        }

        if (this.tomato != null) {
            hamburgerPrice += tomato.getPrice();
            System.out.println("Added tomato for an extra " + tomato.getPrice());
        }

        if (this.lettuce != null) {
            hamburgerPrice += lettuce.getPrice();
            System.out.println("Added lettuce for an extra " + lettuce.getPrice());
        }

        if (this.carrot != null) {
            hamburgerPrice += carrot.getPrice();
            System.out.println("Added carrot for an extra " + carrot.getPrice());
        }
        return hamburgerPrice;
    }
}

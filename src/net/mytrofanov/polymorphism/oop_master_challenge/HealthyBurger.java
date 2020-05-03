package net.mytrofanov.polymorphism.oop_master_challenge;

import net.mytrofanov.polymorphism.oop_master_challenge.additions.Corn;
import net.mytrofanov.polymorphism.oop_master_challenge.additions.Pepper;

public class HealthyBurger extends BaseHamburger {
    private Corn corn;
    private Pepper pepper;

    public HealthyBurger(String name, String meat, int price) {
        super(name, "brown rye bread", meat, price);
    }

    @Override
    public double getBurgerInfo() {
        double burgerPrice = super.getBurgerInfo();
        if (this.corn != null) {
            burgerPrice += corn.getPrice();
            System.out.println("Added corn for an extra " + corn.getPrice());
        }
        if (this.pepper != null) {
            burgerPrice += pepper.getPrice();
            System.out.println("Added cheese for an extra " + pepper.getPrice());
        }
        return burgerPrice;
    }

    public void setCorn(Corn corn) {
        this.corn = corn;
    }

    public void setPepper(Pepper pepper) {
        this.pepper = pepper;
    }
}


package com.jpolak;

public class HealthyBurger extends Hamburger {

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;


    public HealthyBurger( double price, String meat) {
        super("Healthy", price, "Brown Rye", meat);

    }

    public void addHamburgerAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addHamburgerAddition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.addition5Name != null) {
            System.out.println("Added healthy " + this.addition5Name + " for an extra " + this.addition5Price + "$");
            hamburgerPrice += this.addition5Price;
        }
        if (this.addition6Name != null) {
            System.out.println("Added healthy " + this.addition6Name + " for an extra " + this.addition6Price + "$");
            hamburgerPrice += this.addition6Price;
        }

        return hamburgerPrice;

    }
}

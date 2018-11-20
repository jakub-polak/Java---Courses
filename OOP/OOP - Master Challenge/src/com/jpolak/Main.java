package com.jpolak;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Regular Burger", 3, "White", "Beef");
        hamburger.addHamburgerAddition1("Lettuce", 0.3);
        hamburger.addHamburgerAddition2("Tomato", 0.3);
        System.out.println("Total price: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(4.0, "Beef");
        healthyBurger.addHamburgerAddition5("Cheese", 0.9);
        System.out.println("Total price: " + healthyBurger.itemizeHamburger() + "$");

        DeluxeBurger deluxeBurger = new DeluxeBurger("White", "Beef");
        deluxeBurger.addHamburgerAddition1("Cheese", 0.9);
        System.out.println("Total price: " + deluxeBurger.itemizeHamburger() + "$");


    }
}

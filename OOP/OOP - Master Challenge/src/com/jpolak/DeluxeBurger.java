package com.jpolak;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadRollType, String meat) {
        super("Deluxe", 12, breadRollType, meat);
        super.addHamburgerAddition1("Chips", 2.0);
        super.addHamburgerAddition2("Drink", 1.5);


    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You can not add additional items to a Deluxe Burger!");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You can not add additions to Deluxe Burger!");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You can not add additions to Deluxe Burger!");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You can not add additions to Deluxe Burger!");
    }
}

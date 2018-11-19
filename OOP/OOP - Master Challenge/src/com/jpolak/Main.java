package com.jpolak;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("McDouble", 3, "White", "Beef");
        hamburger.addHamburgerAddition1("Lettuce", 0.3);
        hamburger.addHamburgerAddition2("Tomato", 0.3);

        hamburger.itemizeHamburger();
    }
}

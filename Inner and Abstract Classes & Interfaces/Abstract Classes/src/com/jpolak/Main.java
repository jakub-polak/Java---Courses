package com.jpolak;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog doge = new Dog("Doge");
        doge.eat();
        doge.breathe();

        Parrot birdy = new Parrot("Birdy");
        birdy.eat();
        birdy.breathe();
        birdy.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();

    }
}

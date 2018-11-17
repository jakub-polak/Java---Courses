package com.jpolak;

public class Dog extends com.jpolak.Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    @Override
    public void eat() {
        System.out.println("Dog eats");
        chew();
        super.eat();
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog chews");
    }

    public void walk() {
        System.out.println("Dog walks");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog runs");
        move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog moves its legs");
    }

    @Override
    public void move(int speed) {
        System.out.println("Animal moves");
        moveLegs(speed);
        super.move(speed);
    }
}
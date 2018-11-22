package com.jpolak;

public class Main {

    public static void main(String[] args) {

        Bank alior = new Bank();
        alior.addBranch("Cracow");
        alior.addCustomer("Cracow", "Jakub",100.0);
        alior.findBranch("Cracow").addTransaction("Jakub", 20.0);
    }
}

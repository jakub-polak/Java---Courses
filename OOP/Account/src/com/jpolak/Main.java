package com.jpolak;

public class Main {

    public static void main(String[] args) {

        //Account bobsAccount = new Account("123", 2.50, "Jakub", "ads@o2.pl", "12345");
        Account bobsAccount = new Account();

        bobsAccount.deposit(200.0);
        bobsAccount.withdrawal(100.0);

        VipCustomer bobsVipAccount = new VipCustomer("Jakub", 100.00);
        System.out.println(bobsVipAccount.getCreditLimit());
        System.out.println(bobsVipAccount.getEmailAddress());

    }
}

package com.jpolak;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.branchName = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(String name, double initialAmount) {
        Customer newCustomer = new Customer(name, initialAmount);
        this.customers.add(newCustomer);
    }

    public void addTransaction(String name, double amount) {
        findCustomer(name).addTransaction(amount);
        System.out.println("dodaje " + amount + " hajsiwa do konta " + name);
    }

    public Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return customers.get(i);
            }
        }
        return null;
    }
}

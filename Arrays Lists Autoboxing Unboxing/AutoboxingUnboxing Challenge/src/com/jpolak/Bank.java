package com.jpolak;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String name) {
        Branch newBranch = new Branch(name);
        this.branches.add(newBranch);
    }

    public void addCustomer(String branchName, String customerName, double initialAmount) {
        findBranch(branchName).addCustomer(customerName, initialAmount);
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }
}

package com.jpolak;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        int choice = 0;
        boolean quit = false;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add a contact");
        System.out.println("\t 3 - To update a contact");
        System.out.println("\t 4 - To remove a contact");
        System.out.println("\t 5 - To find contact");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void printContactList() {
        mobilePhone.printContactList();
    }

    public static void addContact() {
        System.out.println("Adding a new contact");
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");
        String number = scanner.nextLine();
        mobilePhone.addContact(name, number);
    }

    public static void updateContact() {
        System.out.println("Updating a contact");
        System.out.println("Enter contact name to update: ");
        String oldContactName = scanner.nextLine();
        System.out.println("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();
        mobilePhone.updateContact(oldContactName, newContactName, newNumber);
    }

    public static void removeContact() {
        System.out.println("Removing a contact");
        System.out.println("Enter contact name to remove: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void findContact() {
        System.out.println("Finding a contact");
        System.out.println("Enter contact name to find: ");
        String name = scanner.nextLine();
        int position = mobilePhone.findContact(name);
        if (position >= 0) {
            System.out.println("Contact is " + position + " on the list");
        } else {
            System.out.println("There is not any contact that match this name");
        }
    }
}

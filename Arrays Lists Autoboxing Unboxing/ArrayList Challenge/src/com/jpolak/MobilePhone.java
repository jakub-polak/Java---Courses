package com.jpolak;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactsList = new ArrayList<Contact>();

    public void addContact(String name, String number) {
        Contact contact = Contact.createContact(name, number);
        contactsList.add(contact);
        System.out.println("Contact: " + name + " #" + number + " was added to your contacts list");
    }

    public void printContactList() {
        if (contactsList.size() > 0) {
            System.out.println("You have " + contactsList.size() + " contacts in your mobile phone");
            for(int i = 0; i < contactsList.size(); i++) {
                System.out.println("Contact " + i + ": " + contactsList.get(i).getName() + " #" + contactsList.get(i).getNumber());
            }
        } else {
            System.out.println("There are any contacts in your mobile phone");
        }
    }

    public void updateContact(String oldContactName, String newContactName, String newNumber) {
        int position = findContact(oldContactName);
        if(position >= 0) {
            updateContact(position, newContactName, newNumber);
        }
    }

    public void updateContact(int position, String newContactName, String newNumber) {
        Contact newContact = Contact.createContact(newContactName, newNumber);
        contactsList.set(position, newContact);
    }

    public int findContact(String name) {
        for(int i = 0; i < contactsList.size(); i++) {
            String searchName = contactsList.get(i).getName();
            if (name.equals(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public void removeContact(String name) {
        int position = findContact(name);
        contactsList.remove(position);
    }


}

package com.jpolak;

public class Contact {

    private String name;
    private String number;

    private Contact(String fullName, String number) {
        this.name = fullName;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contact createContact(String name, String number) {
        return new Contact(name, number);
    }
}

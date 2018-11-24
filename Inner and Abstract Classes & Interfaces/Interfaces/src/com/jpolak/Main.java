package com.jpolak;

public class Main {

    public static void main(String[] args) {
        //ITelephone timsPhone;
        ITelephone timsPhone = new DeskPhone(123);
        timsPhone.powerOn();
        timsPhone.callPhone(123);
        timsPhone.answer();


        timsPhone = new MobilePhone(1234);
        timsPhone.powerOn();
        timsPhone.callPhone(1234);
        timsPhone.answer();
    }
}

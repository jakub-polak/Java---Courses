package com.jpolak;

import java.awt.geom.Arc2D;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Jakub");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //Autoboxing
        Integer integer = new Integer(54);
        Double doubleValue = new Double("1.234");

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i * 10));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // at compile time --> Integer.valueOf(56);
        int myInt = myIntValue;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double k = 0.0; k < 10.0; k += 0.5) {
            myDoubleValues.add(k);
        }
        for (int k = 0; k < 10; k ++) {
            double value = myDoubleValues.get(k).doubleValue();
            System.out.println(k + " ---> " + value);
        }

    }
}

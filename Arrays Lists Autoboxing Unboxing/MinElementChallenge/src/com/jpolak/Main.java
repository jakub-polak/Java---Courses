package com.jpolak;

import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter length of array: ");
        int count = s.nextInt();
        System.out.println("Minimum value in array: " + findMin(readIntegers(count)));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " values: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Element " + i + ": ");
            array[i] = s.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}

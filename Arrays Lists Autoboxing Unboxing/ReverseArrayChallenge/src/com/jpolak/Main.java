package com.jpolak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int halfLength = (array.length/2);
        int maxIndex = array.length -1;
        int temp;
        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

    }
}

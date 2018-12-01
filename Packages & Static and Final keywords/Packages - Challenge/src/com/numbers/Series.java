package com.numbers;

public class Series {

    public Series() {
    }

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }

    public static int factorial(int n) {
        int fac = 1;
        System.out.println("0");
        for (int i = 1; i <= n; i++) {
            fac *= i;
            System.out.println(fac);
        }
        return fac;
    }

    public static int fibonacci(int n) {
        int[] fib = new int[n+1];
        fib[0] = 0;
        System.out.println(fib[0]);
        fib[1] = 1;
        System.out.println(fib[1]);

        for (int i = 2; i <= n; i ++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
        }

        return fib[n];
    }
}

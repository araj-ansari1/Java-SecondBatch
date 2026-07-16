package com.app;

public class Factorial {
    public void calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        System.out.println(result);
    }
}
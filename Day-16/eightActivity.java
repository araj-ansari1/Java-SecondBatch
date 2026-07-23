package com.app;

public class eightActivity {
    public static void main(String[] args) {
        int number = 123456;
        int reverserNumber = 0;
        int remainder;
        while (number != 0) {
            remainder = number % 10;
            reverserNumber = reverserNumber * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reverce number: " + reverserNumber);

    }

}

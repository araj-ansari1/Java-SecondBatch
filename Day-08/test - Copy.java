package com.app;

import java.util.Scanner;

import com.app.*;

public class test {
    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number: ");  
	int num=sc.nextInt();
        Factorial obj=new Factorial();
	obj.calculateFactorial(num);
    }
}

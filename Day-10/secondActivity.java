package com.app;
import java.util.*;

public class secondActivity{
	public static void main(String args[]){
		int numerator=10;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		
		try{
			int denominator=sc.nextInt();
			int result=numerator/denominator;
			System.out.println("Result of Division: "+result);
		}finally{
			System.out.println("---I am Sure Block---");
		}
	}
}
package com.app;
import java.util.*;
public class firstActivity{
	public static void main(String args[]){
		int numerator=10;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		
		try{
			int denominator=sc.nextInt();	
			int result=numerator/denominator;
			System.out.println("Result of Devision :: "+result);
		
		}catch(ArithmeticException e){
			System.out.println("Division by zero Imposible....");
		}catch(InputMismatchException e){
			System.out.println("Input is in Invalid Formate....");
		}catch(Exception e){
			System.out.println("Developer Concern is comming Developer Concern Required...");
		}
	}
}
package com.app;

import java.util.*;
public class secondActivity{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		try{
			if(age<18){
				throw new MyException();
			}else{
				System.out.println("Age is accepted for voting...");
			}
		}catch(MyException e){
			System.out.println("Exception Raised:: "+e.getMessage());
		}
	}
}
	
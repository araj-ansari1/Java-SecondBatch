package com.app;

abstract class Room{
	abstract int calculateAria(int l, int b);
	abstract int calculatePrime(int l, int b);
}

class text extends Room{
	int calculateAria(int l, int b){
		return l*b;
	}
	
	int calculatePrime(int l, int b){
		return 2 *(l+b);
	}
}
public class thirdActivity{
	public static void main(String args[]){
		Room obj=new text();
		System.out.println("Area---- "+obj.calculateAria(10,20));
		System.out.println("Primer---- "+obj.calculatePrime(10,20));
	}
}
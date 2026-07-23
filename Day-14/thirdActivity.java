package com.app;

class A{
	filal void sayHello(){
		System.out.println("Hello  First class ");
	}
}
class B extends A{
	void sayHello(){
		System.out.println("Hello Second class ");
	}
}
public class thirdActivity{
	public static void main(String args[]){
		A obj=new B();
		obj.sayHello();
	}
}
	
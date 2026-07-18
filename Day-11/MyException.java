package com.app;

public class MyException extends Exception{
	public MyException(){
		super("Age Must be > = 18 ");
	}
}
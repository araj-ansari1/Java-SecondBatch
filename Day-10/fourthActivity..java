package com.app;
import java.io.*;
public class fourthActivity{
	public static void mian(String args[]){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name=br.readLine();
		System.out.println("Hello....... "+name);
	}
}
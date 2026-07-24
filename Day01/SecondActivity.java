package com.app;

import java.io.*;
public class SecondActivity{
	public static void main(String args[]){
		try{
			InputStream ins = new FileInputStream("Source.text");

			byte[] buffer=new byte[50];
			int noc=ins.read(buffer);
			for(byte b:buffer){
				System.out.println((char)b);
			}
		}catch(IOException e){
			System.out.println("The reason or error:: "+e.getMessage());
		}
	}
}
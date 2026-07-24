package com.app;

import java.io.*;

public class ThirdActivity{
	public static void main(String args[]){
		try{
			InputStream ins = new FileInputStream("Source.text");
			byte[] buffer = new byte[10];
			int noc = ins.read(buffer,2,3);
			System.out.println("No of Character :: "+noc);
			for(int i=0; i<10; i++){
				System.out.println(i+" ------> "+(char)buffer[i]);
			}
			ins.close();
		}catch(Exception e){
			System.out.println("The Reason of error :: "+e.getMessage());
		}
	}
}
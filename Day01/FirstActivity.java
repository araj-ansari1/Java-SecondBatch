package com.app;
import java.io.*;

public class FirstActivity{

	public static void main(String args[]){

		try{
			InputStream ins = new FileInputStream("Source.text");
			int ascii=ins.read();
			System.out.println("The Character read :: "+ascii+" Equiavolent character:: "+(char)ascii);

			int asscii=0;
			while((asscii=ins.read())!=-1){
				System.out.println((char)asscii);
			}
			ins.close();
		}catch(Exception e){
			System.out.println("The reason or error:: " +e.getMessage());
		}
	}
}	
		
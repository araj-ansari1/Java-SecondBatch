package com.app;

import java.io.*;

class Room {

	public void inputFormUser() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the value: ");
		String value = br.readLine();

		System.out.println("Hello....... " + value);
	}
}

public class FIrstActivity {
	public static void main(String args[]) throws IOException {
		Room obj = new Room();
		
		obj.inputFormUser();
	}
}
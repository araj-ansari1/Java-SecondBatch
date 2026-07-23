package com.app;

class Room{
	int length=10;
	
	class Chamber{
		int length=20;
		
		void printValues(){
			System.out.println("Length = "+length);
			System.out.println("Accessing the Outer length = "+Room.this.length);
		}
	}
}
public class firstActivityu{
	public static void main(String args[]){
		Room.Chamber obj=new Room().new Chamber();
		obj.printValues();
	}
}
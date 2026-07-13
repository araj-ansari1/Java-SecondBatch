class Room{
	int length;
	int breadth;

	Room(int l, int b){
		length=l;
		breadth=b;
	}
	
	Room(int l){
		 length=breadth=l;
	}
	
	int calculateArea(){
		return length*breadth;
	}
	
}

public class firstActivity{
	public static void main(String args[]){
		Room obj=new Room(10,20);
		
		System.out.println("Area = "+obj.calculateArea());
	}
}
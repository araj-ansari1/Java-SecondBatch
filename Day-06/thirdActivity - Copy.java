class Room{
	int length;
	int breadth;
	
	Room(){
		this(10,20);
	}
	Room(int l, int b){
		length=l;
		breadth=b;
	}
	int calculateAria(){
		return length*breadth;
	}
}
public class thirdActivity{
	public static void main(String args[]){
		Room obj=new Room();
		obj.calculateAria();
		System.out.println("Aria = "+obj.calculateAria());
	}
}
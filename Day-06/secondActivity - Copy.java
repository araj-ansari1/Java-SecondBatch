class Room{
	int length=10;
	class Chamber{
		int length=20;
		void prinValue(){
			System.out.println("Length = "+length);
			System.out.println("Outer Length = "+Room.this.length);
			
		}
	}
}
public class secondActivity{
	public static void main(String args[]){
		Room.Chamber obj=new Room().new Chamber();
		obj.prinValue();
	}
}
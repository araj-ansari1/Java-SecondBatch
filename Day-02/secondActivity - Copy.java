class Room{
	private int length=10;
	
	int getlength(){
		return length;
	}
}
public class secondActivity{
	public static void main(String args[]){
		Room obj=new Room();
		
		System.out.println("Length= "+obj.getlength());
	}
}
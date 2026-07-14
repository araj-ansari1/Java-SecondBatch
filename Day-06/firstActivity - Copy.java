

class Room{
	
	class Chamber{
		Chamber(){
			System.out.println("Cunstroctor of ....... Chamber  ");
		}
		void sayHello(){
			System.out.println("Hello....... From Chamber Inner Class  ");
		}
	}

}
public class firstActivity{
	public static void main(String args[]){

		Room.Chamber obj=new Room().new Chamber();
		
		obj.sayHello();
	}
}
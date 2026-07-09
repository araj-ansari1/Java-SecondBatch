class Room{

	Room(){
		System.out.println("Constructor of Room ");
		System.out.println("-------------------------");
	}


	static {
		System.out.println("Initilization Block ");
	}


	{
		System.out.println("Instance Initilization Block ");
	}
}

public class secondActivity{
	public static void main(String args[]){

		Room obj=new Room();
		Room obj1=new Room();
		Room obj2=new Room();
		Room obj3=new Room();
		Room obj4=new Room();

	}
}
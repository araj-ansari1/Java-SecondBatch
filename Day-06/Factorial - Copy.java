import java.util.Scanner;

class CheckFactorial{
	public void CalculateFactorial(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=sc.nextInt();

		for(int i=1; i<=number; i++){
			int num =i;
			int result=num*i;

			System.out.println(result);
		}
		
	}
}
public class Factorial{
	public static void main(String args[]){
		CheckFactorial obj=new CheckFactorial();
		obj.CalculateFactorial();

	}
}
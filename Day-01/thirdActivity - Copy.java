class A{

	long calculateFactorial(int num){

		if(num==0 || num==1){
			return 1;
		}else{
			return num*calculateFactorial(num-1);
		}
	}
}
public class thirdActivity{
	public static void main(String args[]){

		A obj=new A();
		int a=Integer.parseInt(args[0]);
		System.out.println("The Factorial "+a+" is :: "+obj.calculateFactorial(a));

	}
}
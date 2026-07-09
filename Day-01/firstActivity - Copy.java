class Operation{
	void sayHello(){
		System.out.println("Hello......from Operation class ");
	}
	boolean isEven(int num){
		if(num%2==0){
			return true;
		}else{
			return false;
		}
	}
}
public class firstActivity{
	static long calculateFactorial(int num){
		long result=1;
		for(int i=1; i<=num; i++){
			result=result*i;
		}
		return result;
	}
	

	public static void main(String args[]){
		Operation obj=new Operation();
		System.out.println("Fatorial os 5 :: "+calculateFactorial(5));
		
		System.out.println("Is 5 on Even Number :: "+obj.isEven(5));
	}
}
class A {

	A(String name){

		System.out.println("Cunstructor of A ");
		System.out.println("Hello...... "+name);
	}

}

class B extends A {

	B(){
		super("Araj");
		System.out.println("Cunstructor of B ");
	}

}

public class thirdActivity {
    public static void main(String args[]) {
	
	A ob=new B();

    }

}
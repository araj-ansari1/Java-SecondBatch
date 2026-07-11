
class A {
    static void sayHello() {
        System.out.println("Hello.......A");
    }
}

class B extends A {
    static void sayHello() {
        System.out.println("Hello......B");
    }
}

public class thirdActivity {
    public static void main(String args[]) {
        A obj = new B();

        obj.sayHello();
    }

}

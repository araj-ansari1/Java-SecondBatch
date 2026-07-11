class A {
    int length = 10;

    void sayHello() {
        System.out.println("Hello..... from A class");
    }
}

class B extends A {

    int breadth = 20;

    void sayHi() {
        System.out.println("Hi.... form B");
    }
}

public class firstActivity {
    public static void main(String args[]) {
        B obj = new B();

        System.out.println("Length= " + obj.length);
        obj.sayHello();

        System.out.println("Breadth= "+obj.breadth);
        obj.sayHi();

    }
}
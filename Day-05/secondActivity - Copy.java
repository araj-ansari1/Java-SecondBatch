
class Room {
    int calculateArea(int l) {
        System.out.println("Hello forst");
        return l * l;
    }

    int calculateArea(int l, int b) {
        return l * b;
    }

    double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }
}

public class secondActivity {
    public static void main(String args[]) {
        Room obj = new Room();

        System.out.println("Area = " + obj.calculateArea(10));
        System.out.println("Area = " + obj.calculateArea(10, 5));
        System.out.println("Area = " + obj.calculateArea(4.5f));
    }
}

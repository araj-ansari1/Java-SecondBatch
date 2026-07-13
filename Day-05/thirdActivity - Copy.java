class Room {
    int length;
    int breadth;

    Room(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printValue() {
        System.out.println("Length = " + length + " Breadth = " + breadth);
    }
}

public class thirdActivity {
    public static void main(String args[]) {
        Room obj = new Room(10, 5);
        obj.printValue();
    }
}
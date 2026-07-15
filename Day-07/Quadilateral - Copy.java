package shape.quad;

public class Quadilateral {
    public int calculateAreaReact(int lenght, int bredth) {
        return lenght * bredth;
    }

    public int calculateAreaCuboid(int length, int breadth, int height) {
        return 2 * (length * breadth + length * height + breadth * height);

    }
}

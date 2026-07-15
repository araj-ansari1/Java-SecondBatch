package shape.circle;

public class Circle {

    public double calculateAreaCircle(float radius) {
        return Math.PI * radius * radius;

    }

    public double calculateAreaSphare(float radius) {
        return 4 * Math.PI * radius * radius;
    }
}

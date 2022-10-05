package app.shapes;

public class Circle implements GeometricShape {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("The radius cannot be negative. Radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

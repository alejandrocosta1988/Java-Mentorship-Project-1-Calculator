package app.shapes;

public class Rectangle implements GeometricShape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width cannot be negative. Length: " + length + "; Width: " + width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

}

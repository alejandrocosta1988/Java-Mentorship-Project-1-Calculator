package app.shapes;

public class Square implements GeometricShape {

    private double sideLength;

    public Square(double sideLength) {
        if (sideLength < 0)
            throw new IllegalArgumentException("Side length cannot be negative. Side length: " + sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

}

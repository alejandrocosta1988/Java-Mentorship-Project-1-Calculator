package app.calculator;

import app.shapes.GeometricShape;

public class AreaCalculator extends Calculator {

    private GeometricShape shape;

    public void changeShape(GeometricShape shape) {
        this.shape = shape;
    }

    public GeometricShape getShape() {
        return shape;
    }

    @Override
    public double getResult() {
        if (shape == null)
            return 0;
        return shape.calculateArea();
    }
}

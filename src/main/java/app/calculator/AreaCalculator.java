package app.calculator;

import app.shapes.Circle;

public class AreaCalculator extends Calculator {

    private Circle shape;

    public void changeShape(Circle shape) {
        this.shape = shape;
    }

    public Circle getShape() {
        return shape;
    }

    @Override
    public double getResult() {
        if (shape == null) {
            return 0;
        }
        return shape.calculateArea();
    }
}

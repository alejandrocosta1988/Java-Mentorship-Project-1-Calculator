package app.calculator;

public class BmiCalculator extends Calculator {

    private double height;

    public void setHeight(double height) throws BmiException {
        if (height <= 0)
            throw new BmiException(height);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}

package app.calculator;

public class Calculator {

    private double result = 0d;

    public void add(double value) {
        result = BasicOperation.add(result, value);
    }

    public void subtract(double value) {
        result = BasicOperation.subtract(result, value);
    }

    public void multiply(double value) {
        result = BasicOperation.multiply(result, value);
    }

    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public double exponentiate(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double getResult() {
        return result;
    }
}

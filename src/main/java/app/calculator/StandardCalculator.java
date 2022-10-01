package app.calculator;

public class StandardCalculator extends Calculator {

    public void add(double value) {
        result = BasicOperation.add(result, value);
    }

    public void subtract(double value) {
        result = BasicOperation.subtract(result, value);
    }

    public void multiply(double value) {
        result = BasicOperation.multiply(result, value);
    }

    public void divide(double value) {
        result = BasicOperation.divide(result, value);
    }

    public void exponentiate(double value) {
        result = BasicOperation.exponentiate(result, value);
    }

}

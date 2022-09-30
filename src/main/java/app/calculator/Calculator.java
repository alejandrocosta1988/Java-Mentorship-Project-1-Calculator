package app.calculator;

import java.math.BigDecimal;

public class Calculator {

    private double result = 0d;

    public void add(double number) {
        result = BasicOperation.add(result, number);
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
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

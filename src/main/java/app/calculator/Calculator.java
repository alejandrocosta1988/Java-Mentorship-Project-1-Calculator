package app.calculator;

import java.math.BigDecimal;

public class Calculator {

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
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
}

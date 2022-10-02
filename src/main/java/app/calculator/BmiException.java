package app.calculator;

public class BmiException extends Exception {

    private double invalidValue;
    private String message = "The value must be positive. Invalid value: ";

    public BmiException(double invalidValue) {
        this.invalidValue = invalidValue;
    }

    @Override
    public String getMessage() {
        return message + invalidValue;
    }

}

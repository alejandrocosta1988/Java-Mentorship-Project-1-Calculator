package app.calculator;

public class BmiException extends Exception {

    private double invalidHeight;
    private String invalidHeightMessage = "Informed height must be greater than zero. Invalid value: ";

    public BmiException(double invalidHeight) {
        this.invalidHeight = invalidHeight;
    }

    @Override
    public String getMessage() {
        return invalidHeightMessage + invalidHeight;
    }

}

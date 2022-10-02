package app.calculator;

public class BmiCalculator extends Calculator {

    private double height;
    private double weight;

    public void setHeight(double height) throws BmiException {
        if (!isValid(height))
            throw new BmiException(height);
        this.height = height;
    }

    private boolean isValid(double value) {
        return value > 0;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) throws BmiException {
        if (!isValid(weight))
            throw new BmiException(weight);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void calculateBmi() throws BmiException {
        checkInvalidHeight();
        checkInvalidWeight();
        result = weight / Math.pow(height, 2);
    }

    private void checkInvalidHeight() throws BmiException {
        if (height <= 0)
            throw new BmiException(height);
    }

    private void checkInvalidWeight() throws BmiException {
        if (weight <= 0)
            throw new BmiException(weight);
    }

}

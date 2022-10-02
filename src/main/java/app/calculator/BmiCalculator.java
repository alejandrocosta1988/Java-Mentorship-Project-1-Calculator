package app.calculator;

public class BmiCalculator extends Calculator {

    private double height;
    private double weight;

    public void setHeight(double height) throws BmiException {
        if (height <= 0)
            throw new BmiException(height);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) throws BmiException {
        if (weight <= 0)
            throw new BmiException(weight);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

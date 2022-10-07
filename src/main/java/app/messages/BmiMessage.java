package app.messages;

public class BmiMessage {

    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public String getInterpretation() {
        String interpretation = "";
        if (result < 18.5) {
            interpretation = "Your BMI is in the underweight range.";
            return interpretation;
        }
        if (result < 25) {
            interpretation =  "Your BMI is in the healthy weight range.";
            return interpretation;
        }
        if (result < 29.9) {
            interpretation = "Your BMI is in the overweight range.";
            return interpretation;
        }
        if (result >= 29.9) {
            interpretation = "Your BMI is in the obese range.";
        }
        return interpretation;
    }

}

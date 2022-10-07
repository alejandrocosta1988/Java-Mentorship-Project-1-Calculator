package app.messages;

import java.util.EnumMap;
import java.util.Map;

public class BmiMessage {

    private double result;
    private final String ASK_FOR_WEIGHT_MESSAGE = "Enter weight value in kilogram:";
    private final String ASK_FOR_HEIGHT_MESSAGE = "Enter height value in meters:";

    enum BmiInterpretation {
        UNDERWEIGHT,
        HEALTHY_WEIGHT,
        OVERWEIGHT,
        OBESE
    }

    private Map<BmiInterpretation, String> interpretation;

    public void setResult(double result) {
        this.result = result;
    }

    public String getInterpretation() {
        initializeBmiInterpretation();
        return interpretation.get(translateResultToInterpretation());
    }

    private void initializeBmiInterpretation() {
        if (interpretation == null) {
            interpretation = new EnumMap<>(BmiMessage.BmiInterpretation.class);
            interpretation.put(BmiInterpretation.UNDERWEIGHT, "Your BMI is in the underweight range.");
            interpretation.put(BmiInterpretation.HEALTHY_WEIGHT, "Your BMI is in the healthy weight range.");
            interpretation.put(BmiInterpretation.OVERWEIGHT, "Your BMI is in the overweight range.");
            interpretation.put(BmiInterpretation.OBESE, "Your BMI is in the obese range.");
        }
    }

    private BmiInterpretation translateResultToInterpretation() {
        if (isResultUnderweight()) return BmiInterpretation.UNDERWEIGHT;
        if (isResultHealthyWeight()) return BmiInterpretation.HEALTHY_WEIGHT;
        if (isResultOverweight()) return BmiInterpretation.OVERWEIGHT;
        return BmiInterpretation.OBESE;
    }

    private boolean isResultUnderweight() {
        if (result < 18.5) return true;
        return false;
    }

    private boolean isResultHealthyWeight() {
        if (result >= 18.5 && result < 25) return true;
        return false;
    }

    private boolean isResultOverweight() {
        if (result >= 25 && result < 29.9) return true;
        return false;
    }

    public String askForWeight() {
        return ASK_FOR_WEIGHT_MESSAGE;
    }

    public String askForHeight() {
        return ASK_FOR_HEIGHT_MESSAGE;
    }
}

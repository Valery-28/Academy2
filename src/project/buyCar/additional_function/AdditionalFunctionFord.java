package project.buyCar.additional_function;

public class AdditionalFunctionFord extends AdditionalFunction {
    private final boolean isThereAHatch;

    public AdditionalFunctionFord(boolean isThereAHatch) {
        this.isThereAHatch = isThereAHatch;
    }

    @Override
    public String toString() {
        return "(hatch: " + isThereAHatch + ")";
    }
}

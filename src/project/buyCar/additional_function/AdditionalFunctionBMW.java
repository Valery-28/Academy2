package project.buyCar.additional_function;

public class AdditionalFunctionBMW extends AdditionalFunction {

    private final int seatingCapacity;
    private final boolean hatch;

    public AdditionalFunctionBMW(int seatingCapacity, boolean hatch) {
        this.seatingCapacity = seatingCapacity;
        this.hatch = hatch;
    }

    @Override
    public String toString() {
        return "(seatingCapacity: " + seatingCapacity +
                ", hatch: " + hatch + ")";
    }
}

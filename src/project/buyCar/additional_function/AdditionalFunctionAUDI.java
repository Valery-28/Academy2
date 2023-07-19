package project.buyCar.additional_function;

public class AdditionalFunctionAUDI extends AdditionalFunction {
    private final boolean touchScreen;
    private final int maintenance;

    public AdditionalFunctionAUDI(boolean touchScreen, int maintenance) {
        this.touchScreen = touchScreen;
        this.maintenance = maintenance;
    }

    @Override
    public String toString() {
        return "(" + "touch screen: " + touchScreen + ", how make maintenance: " + maintenance + " km" + ")";
    }
}

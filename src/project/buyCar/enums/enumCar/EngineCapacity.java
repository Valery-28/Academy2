package project.buyCar.enums.enumCar;

public enum EngineCapacity {
    MIN(1.0), SMALL(1.6), STANDARD(2.0), BIG(3.0), MAX(5.0);
    private final double values;
    EngineCapacity(double values) {
        this.values=values;
    }

    public double getValues() {
        return values;
    }
}

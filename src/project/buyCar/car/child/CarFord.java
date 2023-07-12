package project.buyCar.car.child;

import project.buyCar.car.parent.AbstractCar;
import project.buyCar.enums.enumFord.*;

import java.util.Set;

public class CarFord extends AbstractCar {
    private final boolean isThereAHatch;

    public CarFord(ModelCarFord modelCar, ColorCarFord colorCar, EngineCapacityFord engineCapacity,
                   SizeWheelFord sizeWheel, Integer yearRelease, Set<String> option, boolean isThereAHatch) {
        super(modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.isThereAHatch = isThereAHatch;
    }

    public boolean getThereAHatch() {
        return isThereAHatch;
    }

    @Override
    public String toString() {
        String BRAND = "Ford";
        return "Brand: " + BRAND + super.toString() + ", Hatch: " + getThereAHatch();
    }
}

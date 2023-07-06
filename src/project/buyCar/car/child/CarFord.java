package project.buyCar.car.child;

import project.buyCar.car.parent.Car;
import project.buyCar.enums.enumCar.*;
import project.buyCar.enums.enumFord.ColorCarFord;
import project.buyCar.enums.enumFord.EngineCapacityFord;
import project.buyCar.enums.enumFord.ModelCarFord;
import project.buyCar.enums.enumFord.SizeWheelFord;

import java.util.Set;

public class CarFord extends Car {
    private final Boolean isThereAHatch;

    public CarFord(Brand brand, ModelCarFord modelCar, ColorCarFord colorCar, EngineCapacityFord engineCapacity,
                   SizeWheelFord sizeWheel, Integer yearRelease, Set<String> option, Boolean isThereAHatch) {
        super(brand, modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.isThereAHatch = isThereAHatch;
    }

    public Boolean getThereAHatch() {
        return isThereAHatch;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hatch: " + getThereAHatch();
    }
}

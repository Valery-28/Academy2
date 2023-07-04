package project.buyCar.car.child;

import project.buyCar.car.parent.Car;
import project.buyCar.enums.enumCar.CorolCar;
import project.buyCar.enums.enumCar.EngineCapacity;
import project.buyCar.enums.enumCar.Brand;
import project.buyCar.enums.enumCar.SizeWheel;
import project.buyCar.enums.enumModel.enumFord.ModelCarFord;

import java.util.Set;

public class CarFord extends Car {
    private final ModelCarFord modelCarFord;
    private final Boolean isThereAHatch;

    public CarFord(ModelCarFord modelCarFord, CorolCar colorCar, EngineCapacity engineCapacity,
                   SizeWheel sizeWheel, Integer yearRelease, Set<String> option, Boolean isThereAHatch) {
        super(Brand.FORD, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.modelCarFord = modelCarFord;
        this.isThereAHatch = isThereAHatch;
    }

    public ModelCarFord getModelCarFord() {
        return modelCarFord;
    }
    public Boolean getThereAHatch() {
        return isThereAHatch;
    }

    @Override
    public String toString() {
        return "Model: "+getModelCarFord()+ super.toString() + ", Hatch: " + getThereAHatch();
    }
}

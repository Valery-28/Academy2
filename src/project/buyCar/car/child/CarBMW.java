package project.buyCar.car.child;

import project.buyCar.car.parent.Car;
import project.buyCar.enums.enumModel.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumCar.CorolCar;
import project.buyCar.enums.enumCar.EngineCapacity;
import project.buyCar.enums.enumCar.Brand;
import project.buyCar.enums.enumCar.SizeWheel;

import java.util.Set;

public class CarBMW extends Car {
    private final ModelCarBMW modelCarBMW;
    private final Integer howOftenToDoMaintenance;

    public CarBMW(ModelCarBMW modelCarBMW, CorolCar colorCar, EngineCapacity engineCapacity,
                  SizeWheel sizeWheel, Integer yearRelease, Set<String> option, Integer howOftenToDoMaintenance) {
        super(Brand.BMW, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.modelCarBMW = modelCarBMW;
        this.howOftenToDoMaintenance = howOftenToDoMaintenance;
    }

    public Integer getHowOftenToDoMaintenance() {
        return howOftenToDoMaintenance;
    }

    public ModelCarBMW getModelCarBMW() {
        return modelCarBMW;
    }

    @Override
    public String toString() {
        return "Model: " + getModelCarBMW() + super.toString() +
                ", Maintenance is required to be done every: " + getHowOftenToDoMaintenance() + " km.";
    }
}

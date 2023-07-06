package project.buyCar.car.child;

import project.buyCar.car.parent.AbstractCar;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumBMW.EngineCapacityBMW;
import project.buyCar.enums.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumBMW.SizeWheelBMW;

import java.util.Set;

public class CarBMW extends AbstractCar {
    public CarBMW(ModelCarBMW modelCar, ColorCarBMW colorCar, EngineCapacityBMW engineCapacity,
                  SizeWheelBMW sizeWheel, Integer yearRelease, Set<String> option) {
        super(modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option);

    }

    @Override
    public String toString() {
        int HOW_OFTEN_TO_DO_MAINTENANCE = 8000;
        String BRAND = "BMW";
        return "Brand: "+ BRAND + super.toString() +
                ", Maintenance is required to be done every: " + HOW_OFTEN_TO_DO_MAINTENANCE + " km.";
    }
}

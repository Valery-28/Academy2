package project.buyCar.car.child;

import project.buyCar.car.parent.Car;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumBMW.EngineCapacityBMW;
import project.buyCar.enums.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumBMW.SizeWheelBMW;
import project.buyCar.enums.enumCar.Brand;

import java.util.Set;

;

public class CarBMW extends Car {
    private final int HOW_OFTEN_TO_DO_MAINTENANCE = 8000;
    public CarBMW(Brand brand, ModelCarBMW modelCar, ColorCarBMW colorCar, EngineCapacityBMW engineCapacity,
                  SizeWheelBMW sizeWheel, Integer yearRelease, Set<String> option) {
        super(brand,modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option);

    }



    @Override
    public String toString() {
        return  super.toString() +
                ", Maintenance is required to be done every: " + HOW_OFTEN_TO_DO_MAINTENANCE + " km.";
    }
}

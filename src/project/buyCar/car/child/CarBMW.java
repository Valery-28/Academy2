package project.buyCar.car.child;

import project.buyCar.car.parent.AbstractCar;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumBMW.EngineCapacityBMW;
import project.buyCar.enums.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumBMW.SizeWheelBMW;

import java.util.Set;

public class CarBMW extends AbstractCar {
    private final int seatingCapacity;
    public CarBMW(ModelCarBMW modelCar, ColorCarBMW colorCar, EngineCapacityBMW engineCapacity,
                  SizeWheelBMW sizeWheel, Integer yearRelease, Set<String> option, int  seatingCapacity) {
        super(modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public String toString() {
        String BRAND = "BMW";

        return "Brand: "+ BRAND + super.toString() +
                ", Seating capacity: " + getSeatingCapacity();
    }
}

package project.buyCar.car.child;

import project.buyCar.additional_function.AdditionalFunctionAUDI;
import project.buyCar.car.parent.AbstractCar;
import project.buyCar.enums.enumAUDI.*;

import java.util.Set;

public class CarAUDI extends AbstractCar {

    public CarAUDI(ModelCarAUDI modelCar, ColorCarAUDI colorCar, EngineCapacityAUDI engineCapacity,
                   SizeWheelAUDI sizeWheel, Integer yearRelease, Set<String> option,
                   AdditionalFunctionAUDI additionalFunctionAUDI) {
        super(modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option, additionalFunctionAUDI);

    }


    @Override
    public String toString() {
        String BRAND = "AUDI";
        return "Brand: " + BRAND + super.toString();
    }
}

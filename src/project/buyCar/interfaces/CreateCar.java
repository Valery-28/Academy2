package project.buyCar.interfaces;

import project.buyCar.additional_function.AdditionalFunction;

import java.util.Set;

public interface CreateCar<BRAND> {
    BRAND create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                 SizeWheelCar sizeWheelCar, Set<String> option, AdditionalFunction additionalFunction);

}

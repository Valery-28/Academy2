package project.buyCar.interfaces;

import java.util.Set;

public interface CreateCar<BRAND,FUNCTION> {
    BRAND create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                 SizeWheelCar sizeWheelCar, Set<String> option,FUNCTION function);

}

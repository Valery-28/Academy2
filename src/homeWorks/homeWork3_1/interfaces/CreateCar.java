package homeWorks.homeWork3_1.interfaces;

import homeWorks.homeWork3_1.classes.object.Car;
import homeWorks.homeWork3_1.enums.CoralCar;
import homeWorks.homeWork3_1.enums.EngineCapasity;
import homeWorks.homeWork3_1.enums.ModelCar;
import homeWorks.homeWork3_1.enums.SizeWheel;

import java.util.Set;

public interface CreateCar {
    Car create(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
               SizeWheel sizeWheel, Set<String> options);
}

package homeWork3_1.interfaces;

import homeWork3_1.classes.Car;
import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;

import java.util.ArrayList;

public interface CreateCar {
    Car create(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
               SizeWheel sizeWheel, Integer yearRelease, ArrayList<String> options);
}

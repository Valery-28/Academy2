package project.buyCar.factoryCar.child.FactoryBMW;

import project.buyCar.car.child.CarBMW;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.enums.enumBMW.*;
import project.buyCar.interfaces.*;

import java.util.Set;

public class BMWFactoryCar extends AbstractFactoryCar<ModelCarBMW, ColorCarBMW, EngineCapacityBMW,
        SizeWheelBMW, CarBMW, Integer> {

    final int YEAR_RELEASE = 2022;

    public BMWFactoryCar(ModelCarBMW[] allModelCar, ColorCarBMW[] allCoralCar,
                         EngineCapacityBMW[] allEngineCapacity, SizeWheelBMW[] allSizeWheel) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public CarBMW create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                         SizeWheelCar sizeWheelCar, Set<String> option, Integer seatingCapacity) {
        return new CarBMW((ModelCarBMW) modelCar, (ColorCarBMW) colorCar, (EngineCapacityBMW) engineCapacityCar,
                (SizeWheelBMW) sizeWheelCar, YEAR_RELEASE, option,seatingCapacity);
    }
}

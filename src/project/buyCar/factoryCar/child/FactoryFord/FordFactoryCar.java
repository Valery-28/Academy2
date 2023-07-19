package project.buyCar.factoryCar.child.FactoryFord;

import project.buyCar.additional_function.AdditionalFunction;
import project.buyCar.additional_function.AdditionalFunctionFord;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumFord.*;
import project.buyCar.interfaces.*;

import java.util.Set;

public class FordFactoryCar extends AbstractFactoryCar<ModelCarFord, ColorCarFord,
        EngineCapacityFord, SizeWheelFord, CarFord> {
    final int YEAR_RELEASE = 2022;

    public FordFactoryCar(ModelCarFord[] allModelCar, ColorCarFord[] allCoralCar,
                          EngineCapacityFord[] allEngineCapacity, SizeWheelFord[] allSizeWheel) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
    }

    @Override
    public CarFord create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                          SizeWheelCar sizeWheelCar, Set<String> option, AdditionalFunction additionalFunction) {
        return new CarFord((ModelCarFord) modelCar, (ColorCarFord) colorCar, (EngineCapacityFord) engineCapacityCar,
                (SizeWheelFord) sizeWheelCar, YEAR_RELEASE, option, (AdditionalFunctionFord) additionalFunction);
    }
}

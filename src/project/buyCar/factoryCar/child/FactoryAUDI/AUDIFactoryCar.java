package project.buyCar.factoryCar.child.FactoryAUDI;


import project.buyCar.additional_function.AdditionalFunction;
import project.buyCar.additional_function.AdditionalFunctionAUDI;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.car.child.CarAUDI;
import project.buyCar.enums.enumAUDI.*;
import project.buyCar.interfaces.*;

import java.util.Set;

public class AUDIFactoryCar extends AbstractFactoryCar<ModelCarAUDI, ColorCarAUDI,
        EngineCapacityAUDI, SizeWheelAUDI, CarAUDI> {
    final int YEAR_RELEASE = 2022;

    public AUDIFactoryCar(ModelCarAUDI[] allModelCar, ColorCarAUDI[] allCoralCar,
                          EngineCapacityAUDI[] allEngineCapacity, SizeWheelAUDI[] allSizeWheel) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
    }

    @Override
    public CarAUDI create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                          SizeWheelCar sizeWheelCar, Set<String> option,
                          AdditionalFunction additionalFunction) {

        return new CarAUDI((ModelCarAUDI) modelCar, (ColorCarAUDI) colorCar, (EngineCapacityAUDI) engineCapacityCar,
                (SizeWheelAUDI) sizeWheelCar, YEAR_RELEASE, option, (AdditionalFunctionAUDI) additionalFunction);
    }
}

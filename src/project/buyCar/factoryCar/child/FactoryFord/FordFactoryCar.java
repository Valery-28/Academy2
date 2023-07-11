package project.buyCar.factoryCar.child.FactoryFord;

import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumFord.ColorCarFord;
import project.buyCar.enums.enumFord.EngineCapacityFord;
import project.buyCar.enums.enumFord.ModelCarFord;
import project.buyCar.enums.enumFord.SizeWheelFord;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.interfaces.ColorCar;
import project.buyCar.interfaces.EngineCapacityCar;
import project.buyCar.interfaces.ModelCar;
import project.buyCar.interfaces.SizeWheelCar;

import java.util.Set;

public class FordFactoryCar extends AbstractFactoryCar<ModelCarFord,ColorCarFord,EngineCapacityFord ,SizeWheelFord,CarFord,Boolean> {
    final int YEAR_RELEASE = 2022;
    public FordFactoryCar(ModelCarFord[] allModelCar, ColorCarFord[] allCoralCar,
                          EngineCapacityFord[] allEngineCapacity, SizeWheelFord[] allSizeWheel) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
    }

    @Override
    public CarFord create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                          SizeWheelCar sizeWheelCar, Set<String> option,Boolean isThereAHatch) {
        return new CarFord((ModelCarFord) modelCar,(ColorCarFord) colorCar,(EngineCapacityFord) engineCapacityCar,
                (SizeWheelFord) sizeWheelCar,YEAR_RELEASE,option,isThereAHatch);
    }
}

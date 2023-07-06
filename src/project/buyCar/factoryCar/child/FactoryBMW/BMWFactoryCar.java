package project.buyCar.factoryCar.child.FactoryBMW;

import project.buyCar.car.child.CarBMW;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumBMW.EngineCapacityBMW;
import project.buyCar.enums.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumBMW.SizeWheelBMW;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;

import java.util.Arrays;
import java.util.Set;

public class BMWFactoryCar extends AbstractFactoryCar {

    final int YEAR_RELEASE = 2022;
    private final ModelCarBMW[] allModelCarBMW = ModelCarBMW.values();
    private final ColorCarBMW[] allCoralCarBMW = ColorCarBMW.values();
    private final EngineCapacityBMW[] allEngineCapacityBMW = EngineCapacityBMW.values();
    private final SizeWheelBMW[] allSizeWheelBMW = SizeWheelBMW.values();

    public void print() {
        System.out.printf("""
                        Welcome to BMW Factory, the following cars are made here:
                        Available Models: %s
                        Available colors: %s
                        Available engine size: %s
                        Available wheel size: %s
                        """,
                Arrays.toString(allModelCarBMW),
                Arrays.toString(allCoralCarBMW),
                Arrays.toString(allEngineCapacityBMW),
                Arrays.toString(allSizeWheelBMW)
        );
    }
    public CarBMW create(ModelCarBMW modelCar, ColorCarBMW colorCar, EngineCapacityBMW engineCapacity,
                         SizeWheelBMW sizeWheel, Set<String> option) {
       return new CarBMW(modelCar, colorCar, engineCapacity, sizeWheel, YEAR_RELEASE, option);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

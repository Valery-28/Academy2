package project.buyCar.factoryCar.child.FactoryBMW;

import project.buyCar.additional_function.AdditionalFunction;
import project.buyCar.additional_function.AdditionalFunctionBMW;
import project.buyCar.factoryCar.child.storage.Storage;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.car.child.CarBMW;
import project.buyCar.enums.enumBMW.*;
import project.buyCar.interfaces.*;

import java.util.HashSet;
import java.util.Set;

public class BMWFactoryCar extends AbstractFactoryCar<ModelCarBMW, ColorCarBMW, EngineCapacityBMW,
        SizeWheelBMW, CarBMW> {
    public static final int YEAR_RELEASE = 2022;
    public final Storage storageBMW;

    public BMWFactoryCar(ModelCarBMW[] allModelCar, ColorCarBMW[] allCoralCar,
                         EngineCapacityBMW[] allEngineCapacity, SizeWheelBMW[] allSizeWheel) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
        this.storageBMW = new Storage();
        fillStorageWithCars();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public CarBMW create(ModelCar modelCar, ColorCar colorCar,
                         EngineCapacityCar engineCapacityCar, SizeWheelCar sizeWheelCar,
                         Set<String> option, AdditionalFunction additionalFunction) {
        CarBMW car = new CarBMW((ModelCarBMW) modelCar, (ColorCarBMW) colorCar,
                (EngineCapacityBMW) engineCapacityCar, (SizeWheelBMW) sizeWheelCar,
                YEAR_RELEASE, option, (AdditionalFunctionBMW) additionalFunction);

        storageBMW.findCarBMW(car);
        return car;
    }

    @Override
    public void fillStorageWithCars() {
        CarBMW car1 = new CarBMW(ModelCarBMW.I8, ColorCarBMW.ORANGE, EngineCapacityBMW.MAX, SizeWheelBMW.R19,
                2022, new HashSet<>(Set.of("Climate control")),
                new AdditionalFunctionBMW(3, true));
        this.storageBMW.addStorageBWM(car1);
        CarBMW car2 = new CarBMW(ModelCarBMW.X5, ColorCarBMW.WHITE, EngineCapacityBMW.STANDARD,
                SizeWheelBMW.R19, 2022,
                new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionBMW(5, false));
        this.storageBMW.addStorageBWM(car2);

    }
}

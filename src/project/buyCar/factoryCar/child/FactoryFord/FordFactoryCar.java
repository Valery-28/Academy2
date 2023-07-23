package project.buyCar.factoryCar.child.FactoryFord;

import project.buyCar.additional_function.AdditionalFunction;
import project.buyCar.additional_function.AdditionalFunctionFord;
import project.buyCar.factoryCar.child.storage.Storage;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumFord.*;
import project.buyCar.interfaces.*;

import java.util.HashSet;
import java.util.Set;

public class FordFactoryCar extends AbstractFactoryCar<ModelCarFord, ColorCarFord,
        EngineCapacityFord, SizeWheelFord, CarFord> {
    public static final int YEAR_RELEASE = 2022;
    public final Storage storageFord;

    public FordFactoryCar(ModelCarFord[] allModelCar, ColorCarFord[] allCoralCar,
                          EngineCapacityFord[] allEngineCapacity, SizeWheelFord[] allSizeWheel) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
        this.storageFord = new Storage();
        fillStorageWithCars();
    }

    @Override
    public CarFord create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                          SizeWheelCar sizeWheelCar, Set<String> option, AdditionalFunction additionalFunction) {

        CarFord car = new CarFord((ModelCarFord) modelCar, (ColorCarFord) colorCar,
                (EngineCapacityFord) engineCapacityCar, (SizeWheelFord) sizeWheelCar,
                YEAR_RELEASE, option, (AdditionalFunctionFord) additionalFunction);

        storageFord.findCarFord(car);
        return car;
    }

    @Override
    public void fillStorageWithCars() {
        CarFord car1 = new CarFord(ModelCarFord.FOCUS, ColorCarFord.PURPLE,
                EngineCapacityFord.STANDARD, SizeWheelFord.R15, 2022,
                new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionFord(true));
        this.storageFord.addStorageFord(car1);

        CarFord car2 = new CarFord(ModelCarFord.ESCALATE, ColorCarFord.RED,
                EngineCapacityFord.MAX, SizeWheelFord.R16,
                2022, new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionFord(true));
        this.storageFord.addStorageFord(car2);
    }
}

package project.buyCar.factoryCar.child.FactoryAUDI;


import project.buyCar.additional_function.AdditionalFunction;
import project.buyCar.additional_function.AdditionalFunctionAUDI;
import project.buyCar.car.child.CarAUDI;
import project.buyCar.enums.enumAUDI.ColorCarAUDI;
import project.buyCar.enums.enumAUDI.EngineCapacityAUDI;
import project.buyCar.enums.enumAUDI.ModelCarAUDI;
import project.buyCar.enums.enumAUDI.SizeWheelAUDI;
import project.buyCar.factoryCar.child.storage.Storage;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.interfaces.ColorCar;
import project.buyCar.interfaces.EngineCapacityCar;
import project.buyCar.interfaces.ModelCar;
import project.buyCar.interfaces.SizeWheelCar;

import java.util.HashSet;
import java.util.Set;

public class AUDIFactoryCar extends AbstractFactoryCar<ModelCarAUDI, ColorCarAUDI,
        EngineCapacityAUDI, SizeWheelAUDI, CarAUDI> {
    public static final int YEAR_RELEASE = 2022;
    public final Storage storageAUDI;

    public AUDIFactoryCar(ModelCarAUDI[] allModelCar, ColorCarAUDI[] allCoralCar,
                          EngineCapacityAUDI[] allEngineCapacity, SizeWheelAUDI[] allSizeWheel) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
        this.storageAUDI = new Storage();
        fillStorageWithCars();
    }

    @Override
    public CarAUDI create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                          SizeWheelCar sizeWheelCar, Set<String> option,
                          AdditionalFunction additionalFunction) {
        CarAUDI car = new CarAUDI((ModelCarAUDI) modelCar, (ColorCarAUDI) colorCar,
                (EngineCapacityAUDI) engineCapacityCar, (SizeWheelAUDI) sizeWheelCar,
                YEAR_RELEASE, option, (AdditionalFunctionAUDI) additionalFunction);
        storageAUDI.findCarAUDI(car);
        return car;
    }

    @Override
    public void fillStorageWithCars() {
        CarAUDI car = new CarAUDI(ModelCarAUDI.A7, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX, SizeWheelAUDI.R17,
                2022, new HashSet<>(Set.of("Climate control")),
                new AdditionalFunctionAUDI(true, 8000));
        this.storageAUDI.addStorageAUDI(car);
        CarAUDI car2 = new CarAUDI(ModelCarAUDI.A7, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX,
                SizeWheelAUDI.R16, 2022, new HashSet<>(Set.of("Road control")),
                new AdditionalFunctionAUDI(true, 10000));
        this.storageAUDI.addStorageAUDI(car2);
    }
}

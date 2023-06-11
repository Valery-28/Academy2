package homeWork3_1.classes;


import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;

import java.util.Set;

public class SalonCar {
    private final FactoryCar factoryCar;
    private final ServiceCar serviceCar;
    public SalonCar(FactoryCar factoryCar,ServiceCar serviceCar) {
        this.factoryCar = factoryCar;
        this.serviceCar = serviceCar;
    }

    public Car sellCar(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
                       SizeWheel sizeWheel,Set<String> options) {

        return factoryCar.create(modelCar, colorCar, engineCapasity,sizeWheel,options);

    }
    public ServiceCar getServiceCar() {
        return serviceCar;
    }
}
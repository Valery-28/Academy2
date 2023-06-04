package homeWork3_1.classes;


import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;

import java.util.ArrayList;

public class SalonCar {
    FactoryCar factoryCar;
    ServiceCar serviceCar;

    public SalonCar(FactoryCar factoryCar, ServiceCar serviceCar) {
        this.factoryCar = factoryCar;
        this.serviceCar = serviceCar;
    }

    public SalonCar(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    public Car sellCar(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
                       SizeWheel sizeWheel, Integer yearRelease, ArrayList<String> options) {
        return factoryCar.createForSalon(modelCar, colorCar, engineCapasity, sizeWheel, yearRelease, options);

    }

    public ServiceCar editCarColor(Car car, CoralCar color) {

        return car.setColarCar(color);
    }

    public ServiceCar changeWheel(Car car, SizeWheel sizeWheel) {
        return car.setSizeWheel(sizeWheel);

    }

    public boolean addOption(Car car, String option) {
        return car.getOptions().add(option);

    }

    public boolean deleteOption(Car car, String option) {
        return car.getOptions().remove(option);
    }

    public ServiceCar setOptions(Car car, ArrayList<String> options) {
        return car.setOptions(options);

    }


}
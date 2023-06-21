package homeWorks.homeWork3_1.classes.services;


import homeWorks.homeWork3_1.classes.object.Car;
import homeWorks.homeWork3_1.enums.CoralCar;
import homeWorks.homeWork3_1.enums.EngineCapasity;
import homeWorks.homeWork3_1.enums.ModelCar;
import homeWorks.homeWork3_1.enums.SizeWheel;
import homeWorks.homeWork3_1.classes.factory.FactoryCar;

import java.util.Set;

public class SalonCar {
    private final FactoryCar factoryCar;
    private final ServiceCar serviceCar;

    public SalonCar(FactoryCar factoryCar, ServiceCar serviceCar) {
        this.factoryCar = factoryCar;
        this.serviceCar = serviceCar;
    }

    public Car sellCar(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
                       SizeWheel sizeWheel, Set<String> options) {

        return factoryCar.create(modelCar, colorCar, engineCapasity, sizeWheel, options);

    }

    public void editColorSalon(Car car, CoralCar colorCar) {
        serviceCar.editCarColor(car, colorCar);
    }

    public void editSizeWheelSalon(Car car, SizeWheel sizeWheel) {
        serviceCar.changeWheel(car, sizeWheel);
    }

    public void addOptionSalon(Car car, String option) {
        serviceCar.addOption(car, option);
    }

    public void deleteOptionSalon(Car car, String option) {
        serviceCar.deleteOption(car, option);
    }

    public void setOptionSalon(Car car, Set<String> option) {
        serviceCar.setOptions(car, option);
    }
    public void factoryStay(){
        factoryCar.print();
    }
}
package homeWorks.homeWork3_1.classes.factory;

import homeWork3.EngineCapacity;
import homeWorks.homeWork3_1.classes.object.Car;
import homeWorks.homeWork3_1.enums.CoralCar;
import homeWorks.homeWork3_1.enums.EngineCapasity;
import homeWorks.homeWork3_1.enums.ModelCar;
import homeWorks.homeWork3_1.enums.SizeWheel;
import homeWorks.homeWork3_1.interfaces.CreateCar;

import java.util.Arrays;
import java.util.Set;

public class FactoryCar implements CreateCar {

    final int YEAR_RELEASE=2022;
    private final ModelCar[] allModelCar = ModelCar.values();
    private final CoralCar[] allCoralCar = CoralCar.values();
    private final EngineCapacity[] allEngineCapacity = EngineCapacity.values();
    private final SizeWheel[] allSizeWheel = SizeWheel.values();
    private final Stock stock;


    public void print() {
        System.out.printf("Available car brands: %s\nAvailable colors: %s\nAvailable engine size: %s\nAvailable wheel size: %s\n",
                Arrays.toString(allModelCar),
                Arrays.toString(allCoralCar),
                Arrays.toString(allEngineCapacity),
                Arrays.toString(allSizeWheel)
        );
    }

    public FactoryCar(Stock stock) {
        this.stock = stock;
    }


    public Car create(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
                      SizeWheel sizeWheel, Set<String> options) {
        Car car = new Car(modelCar, colorCar, engineCapasity, sizeWheel, YEAR_RELEASE,options);

        stock.findCar(car);
        return car;
    }


    @Override
    public String toString() {
        return "Year release: " + YEAR_RELEASE;
    }

}


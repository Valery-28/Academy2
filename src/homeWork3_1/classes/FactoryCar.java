package homeWork3_1.classes;

import homeWork3.EngineCapacity;
import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;
import homeWork3_1.interfaces.CreateCar;

import java.util.Arrays;
import java.util.Set;

public class FactoryCar implements CreateCar {

    final int YEAR_RELEASE;
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

    public FactoryCar(Stock stock,int YEAR_RELEASE) {
        this.stock = stock;
        this.YEAR_RELEASE = YEAR_RELEASE;
    }

    public int getYEAR_RELEASE() {
        return YEAR_RELEASE;
    }

    public Car create(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
                      SizeWheel sizeWheel, Set<String> options) {
        Car car = new Car(modelCar, colorCar, engineCapasity, sizeWheel, options);

        if (stock.findCar(car) != null) {
            return car;
        }
        return new Car(modelCar, colorCar, engineCapasity, sizeWheel, options);
    }


    @Override
    public String toString() {
        return "Year release: " + YEAR_RELEASE;
    }

    public Car create(FactoryCar car) {
        return null;
    }
}


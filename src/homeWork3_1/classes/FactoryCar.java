package homeWork3_1.classes;

import homeWork3.EngineCapacity;
import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;
import homeWork3_1.interfaces.CreateCar;

import java.util.ArrayList;
import java.util.Arrays;

public class FactoryCar implements CreateCar {
    private final ModelCar[] allModelCar = ModelCar.values();
    private final CoralCar[] allCoralCar = CoralCar.values();
    private final EngineCapacity[] allEngineCapasity = EngineCapacity.values();
    private final SizeWheel[] allSizeWheel = SizeWheel.values();
    private final ArrayList<Car> stock = new ArrayList<>();

    public void print() {
        System.out.printf("Available car brands: %s\nAvailable colors: %s\nAvailable engine size: %s\nAvailable wheel size: %s\n",
                Arrays.toString(allModelCar),
                Arrays.toString(allCoralCar),
                Arrays.toString(allEngineCapasity),
                Arrays.toString(allSizeWheel)
        );
    }

    public Car create(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
                      SizeWheel sizeWheel, Integer yearRelease, ArrayList<String> options) {

        Car create = new Car(modelCar, colorCar, engineCapasity, sizeWheel, yearRelease, options);

        stock.add(create);
        return create;
    }

    public Car createForSalon(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
                              SizeWheel sizeWheel, Integer yearRelease, ArrayList<String> options) {

        Car create = new Car(modelCar, colorCar, engineCapasity, sizeWheel, yearRelease, options);


        int compareCoef = -1;
        Car resultCar = null;

        for (Car car : stock) {
            if (compareCoef < compareCar(create, car)) {
                compareCoef = compareCar(create, car);
                resultCar = car;
            }
        }

        if (compareCoef > -1) {
            stock.remove(resultCar);
            resultCar.setColarCar(colorCar);
            resultCar.setSizeWheel(sizeWheel);
            resultCar.setOptions(options);
            return resultCar;
        }

        return create;
    }

    private int compareCar(Car car1, Car car2) {
        int count = 0;

        if (!car1.getYearRelease().equals(car2.getYearRelease())) {
            return -1;
        }

        if (!car1.getModelCar().equals(car2.getModelCar())) {
            return -1;
        }
        if (!car1.getEngineCapasity().equals(car2.getEngineCapasity())) {
            return -1;
        }

        if (car1.getColarCar().equals(car2.getColarCar())) {
            count++;
        }
        if (car1.getOptions().equals(car2.getOptions())) {
            count++;
        }
        if (car1.getSizeWheel().equals(car2.getSizeWheel())) {
            count++;
        }

        return count;

    }

    public ArrayList<Car> getStock() {
        return stock;
    }
}

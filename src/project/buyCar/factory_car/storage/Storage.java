package project.buyCar.factory_car.storage;

import project.buyCar.car.parent.AbstractCar;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<AbstractCar> storage = new ArrayList<>();

    public void addStorage(AbstractCar car) {
        storage.add(car);
    }

    public void getStorage() {
        System.out.println("Stoke:");
        for (AbstractCar cars : storage) {
            System.out.println(cars);
        }
    }

    public void findCar(AbstractCar car) {
        AbstractCar resultCar;
        for (AbstractCar stokeCar : storage) {
            if (car.equals(stokeCar)) {
                CalculateCoefficient(car, stokeCar);
                if (CalculateCoefficient(car, stokeCar) == getMaxCoefficient(car, stokeCar)) {
                    resultCar = car;
                    storage.remove(resultCar);
                    resultCar.setColorCar(car.getColorCar());
                    resultCar.setSizeWheelCar(car.getSizeWheelCar());
                    resultCar.setOption(car.getOption());
                }
                return;
            }
        }
    }

    public int getMaxCoefficient(AbstractCar car1, AbstractCar car2) {
        int temp = CalculateCoefficient(car1, car2);
        int coefficient = 0;
        if (temp >= coefficient) {
            coefficient = temp;
            return coefficient;
        }
        return -1;
    }

    private int CalculateCoefficient(AbstractCar car1, AbstractCar car2) {
        int temp = 0;
        if (car1.getColorCar() == (car2.getColorCar())) {
            temp++;
        }
        if (car1.getSizeWheelCar() == (car2.getSizeWheelCar())) {
            temp++;
        }
        if (car1.getOption() == (car2.getOption())) {
            temp++;
        }
        return temp;
    }
}

package homeWorks.homeWork3_1.classes.factory;


import homeWorks.homeWork3_1.classes.object.Car;

import java.util.ArrayList;

public class Stock {
    private final ArrayList<Car> stoke;

    public Stock(ArrayList<Car> stoke) {
        this.stoke = stoke;
    }

    public void findCar(Car car) {
        Car resultCar;
        for (Car stokeCar : stoke) {
            if (car.equals(stokeCar)) {
                CalculateCoefficient(car, stokeCar);
                if (CalculateCoefficient(car, stokeCar) == getMaxCoefficient(car, stokeCar)) {
                    resultCar = car;
                    stoke.remove(resultCar);
                    resultCar.setColorCar(car.getColorCar());
                    resultCar.setSizeWheel(car.getSizeWheel());
                    resultCar.setOption(car.getOption());
                }
                return;
            }
        }
    }

    public int getMaxCoefficient(Car car1, Car car2) {
        int temp;
        int coefficient = 0;
        temp = CalculateCoefficient(car1, car2);
        if (temp >= coefficient) {
            coefficient = temp;
            return coefficient;
        }
        return -1;
    }

    private int CalculateCoefficient(Car car1, Car car2) {
        int temp = 0;
        if (car1.getColorCar() == (car2.getColorCar())) {
            temp++;
        }
        if (car1.getSizeWheel() == (car2.getSizeWheel())) {
            temp++;
        }
        if (car1.getOption() == (car2.getOption())) {
            temp++;
        }
        return temp;
    }
}



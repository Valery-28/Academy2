package homeWork3_1.classes;


import java.util.ArrayList;

public class Stock {
    private final ArrayList<Car> stoke;

    public ArrayList<Car> getStoke() {
        return stoke;
    }

    public Stock(ArrayList<Car> stoke) {
        this.stoke = stoke;
    }

    public Car findCar(Car car) {
        Car resultCar = null;
        for (Car stokeCar : stoke) {
            if (car.equals(stokeCar)) {
                calculateCoef(car, stokeCar);
                if (calculateCoef(car, stokeCar) == getMaxCoefficient(car, stokeCar)) {
                    resultCar = car;
                    stoke.remove(resultCar);
                    resultCar.setColorCar(car.getColorCar());
                    resultCar.setSizeWheel(car.getSizeWheel());
                    resultCar.setOptions(car.getOptions());

                }
                return resultCar;
            }
        }
        return null;
    }

    public int getMaxCoefficient(Car car1, Car car2) {
        int temp;
        int coefficient = 0;
        temp = calculateCoef(car1, car2);
        if (temp >= coefficient) {
            coefficient = temp;
            return coefficient;
        }
        return -1;
    }

    private int calculateCoef(Car car1, Car car2) {
        int temp = 0;
        if (car1.getColorCar() == (car2.getColorCar())) {
            temp++;
        }
        if (car1.getSizeWheel() == (car2.getSizeWheel())) {
            temp++;
        }
        if (car1.getOptions() == (car2.getOptions())) {
            temp++;
        }
        return temp;
    }
}



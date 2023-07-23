package project.buyCar.factory_car.storage;

import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<CarAUDI> storageAUDI = new ArrayList<>();
    private final List<CarBMW> storageBMW = new ArrayList<>();
    private final List<CarFord> storageFord = new ArrayList<>();

    public void addStorageAUDI(CarAUDI car) {
        storageAUDI.add(car);
    }

    public void addStorageBWM(CarBMW car) {
        storageBMW.add(car);
    }

    public void addStorageFord(CarFord car) {
        storageFord.add(car);
    }

    public void getStorageAUDI() {
        System.out.println("Stoke AUDI:");
        for (CarAUDI carsAUDI : storageAUDI) {
            System.out.println(carsAUDI);
        }
    }

    public void getStorageBMW() {
        System.out.println("Stoke BMW:");
        for (CarBMW carsBMW : storageBMW) {
            System.out.println(carsBMW);
        }

    }

    public void getStorageFord() {
        System.out.println("Stoke Ford:");
        for (CarFord carsFord : storageFord) {
            System.out.println(carsFord);
        }
    }
    public void findCarAUDI(CarAUDI car) {
        CarAUDI resultCar;
        for (CarAUDI stokeCar : storageAUDI) {
            if (car.equals(stokeCar)) {
                CalculateCoefficientAUDI(car, stokeCar);
                if (CalculateCoefficientAUDI(car, stokeCar) == getMaxCoefficientAUDI(car, stokeCar)) {
                    resultCar = car;
                    storageAUDI.remove(resultCar);
                    resultCar.setColorCar(car.getColorCar());
                    resultCar.setSizeWheelCar(car.getSizeWheelCar());
                    resultCar.setOption(car.getOption());
                }
                return;
            }
        }
    }

    public int getMaxCoefficientAUDI(CarAUDI car1, CarAUDI car2) {
        int temp;
        int coefficient = 0;
        temp = CalculateCoefficientAUDI(car1, car2);
        if (temp >= coefficient) {
            coefficient = temp;
            return coefficient;
        }
        return -1;
    }

    private int CalculateCoefficientAUDI(CarAUDI car1, CarAUDI car2) {
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
    public void findCarBMW(CarBMW car) {
        CarBMW resultCar;
        for (CarBMW stokeCar : storageBMW) {
            if (car.equals(stokeCar)) {
                CalculateCoefficientBMW(car, stokeCar);
                if (CalculateCoefficientBMW(car, stokeCar) == getMaxCoefficientBMW(car, stokeCar)) {
                    resultCar = car;
                    storageBMW.remove(resultCar);
                    resultCar.setColorCar(car.getColorCar());
                    resultCar.setSizeWheelCar(car.getSizeWheelCar());
                    resultCar.setOption(car.getOption());
                }
                return;
            }
        }
    }

    public int getMaxCoefficientBMW(CarBMW car1, CarBMW car2) {
        int temp;
        int coefficient = 0;
        temp = CalculateCoefficientBMW(car1, car2);
        if (temp >= coefficient) {
            coefficient = temp;
            return coefficient;
        }
        return -1;
    }

    private int CalculateCoefficientBMW(CarBMW car1, CarBMW car2) {
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
    public void findCarFord(CarFord car) {
        CarFord resultCar;
        for (CarFord stokeCar : storageFord) {
            if (car.equals(stokeCar)) {
                CalculateCoefficientFord(car, stokeCar);
                if (CalculateCoefficientFord(car, stokeCar) == getMaxCoefficientFord(car, stokeCar)) {
                    resultCar = car;
                    storageFord.remove(resultCar);
                    resultCar.setColorCar(car.getColorCar());
                    resultCar.setSizeWheelCar(car.getSizeWheelCar());
                    resultCar.setOption(car.getOption());
                }
                return;
            }
        }
    }

    public int getMaxCoefficientFord(CarFord car1, CarFord car2) {
        int temp;
        int coefficient = 0;
        temp = CalculateCoefficientFord(car1, car2);
        if (temp >= coefficient) {
            coefficient = temp;
            return coefficient;
        }
        return -1;
    }

    private int CalculateCoefficientFord(CarFord car1, CarFord car2) {
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

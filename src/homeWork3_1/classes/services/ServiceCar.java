package homeWork3_1.classes.services;

import homeWork3_1.classes.object.Car;
import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.SizeWheel;

import java.util.Set;

public class ServiceCar {

    public void editCarColor(Car car, CoralCar color) {
        if (car != null && color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }

    public void changeWheel(Car car, SizeWheel sizeWheel) {
        if (car != null && sizeWheel != null && sizeWheel != car.getSizeWheel()) {
            car.setSizeWheel(sizeWheel);
        }
    }

    public void addOption(Car car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }

    public void deleteOption(Car car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }

    public void setOptions(Car car, Set<String> option) {
        if (car != null && car.getOption() != null) {
            car.setOption(option);
        }
    }
}
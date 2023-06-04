package homeWork3_1.classes;

import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.SizeWheel;

import java.util.ArrayList;

public class ServiceCar {

    public void editCarColor(Car car, CoralCar color) {

        car.setColarCar(color);
    }

    public void changeWheel(Car car, SizeWheel sizeWheel) {
        car.setSizeWheel(sizeWheel);

    }

    public void addOption(Car car, String option) {
        car.getOptions().add(option);

    }

    public void deleteOption(Car car, String option) {
        car.getOptions().remove(option);
    }

    public void setOptions(Car car, ArrayList<String> options) {
        car.setOptions(options);

    }

}
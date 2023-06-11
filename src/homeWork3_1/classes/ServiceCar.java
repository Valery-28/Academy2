package homeWork3_1.classes;

import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.SizeWheel;

import java.util.Set;

public class ServiceCar {

    public void editCarColor(Car car, CoralCar color) {
        if (color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }

    public void changeWheel(Car car, SizeWheel sizeWheel) {
        if(sizeWheel != null && sizeWheel !=car.getSizeWheel()) {
            car.setSizeWheel(sizeWheel);
        }
    }

    public void addOption(Car car, String options) {
            car.getOptions().add(options);
        
    }

    public void deleteOption(Car car, String options) {
            car.getOptions().remove(options);

    }

    public void setOptions(Car car, Set<String> options) {
        car.setOptions(options);

    }

}
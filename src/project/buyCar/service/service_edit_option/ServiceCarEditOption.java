package project.buyCar.service.service_edit_option;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;

import java.util.Set;

public class ServiceCarEditOption {
    public void addOption(CarAUDI car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }

    public void addOption(CarBMW car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }

    public void addOption(CarFord car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }

    public void deleteOption(CarAUDI car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }

    public void deleteOption(CarBMW car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }

    public void deleteOption(CarFord car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }

    public void setOptions(CarAUDI car, Set<String> option) {
        if (car != null && car.getOption() != null) {
            car.setOption(option);
        }
    }

    public void setOptions(CarBMW car, Set<String> option) {
        if (car != null && car.getOption() != null) {
            car.setOption(option);
        }
    }

    public void setOptions(CarFord car, Set<String> option) {
        if (car != null && car.getOption() != null) {
            car.setOption(option);
        }
    }
}

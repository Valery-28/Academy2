package project.buyCar.service.service_edit_option;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;

public class AddOption {
    public void addOptionAUDI(CarAUDI car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }
    public void addOptionBMW(CarBMW car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }
    public void addOptionFord(CarFord car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().add(option);
        }
    }
}

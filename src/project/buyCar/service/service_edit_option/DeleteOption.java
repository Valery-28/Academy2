package project.buyCar.service.service_edit_option;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;

public class DeleteOption {
    public void deleteOptionAUDI(CarAUDI car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }
    public void deleteOptionBMW(CarBMW car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }
    public void deleteOptionFord(CarFord car, String option) {
        if (car != null && car.getOption() != null) {
            car.getOption().remove(option);
        }
    }
}

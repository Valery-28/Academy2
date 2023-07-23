package project.buyCar.service.service_edit_option;

import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;

import java.util.Set;

public class SetOption {
    public void setOptionsAUDI(CarAUDI car, Set<String> option) {
        if (car != null && car.getOption() != null) {
            car.setOption(option);
        }
    }
    public void setOptionsBMW(CarBMW car, Set<String> option) {
        if (car != null && car.getOption() != null) {
            car.setOption(option);
        }
    }
    public void setOptionsFord(CarFord car, Set<String> option) {
        if (car != null && car.getOption() != null) {
            car.setOption(option);
        }
    }
}

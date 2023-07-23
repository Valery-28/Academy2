package project.buyCar.service.service_edit_colar;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.ColorCarAUDI;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumFord.ColorCarFord;

public class EditColor {
    public void editCarColorAUDI(CarAUDI car, ColorCarAUDI color) {
        if (car != null && color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }

    public void editCarColorBMW(CarBMW car, ColorCarBMW color) {
        if (car != null && color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }

    public void editCarColorFord(CarFord car, ColorCarFord color) {
        if (car != null && color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }
}
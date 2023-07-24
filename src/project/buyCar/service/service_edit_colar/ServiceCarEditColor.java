package project.buyCar.service.service_edit_colar;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.ColorCarAUDI;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumFord.ColorCarFord;

public class ServiceCarEditColor {
    public void editCarColor(CarAUDI car, ColorCarAUDI color) {
        if (car != null && color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }

    public void editCarColor(CarBMW car, ColorCarBMW color) {
        if (car != null && color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }

    public void editCarColor(CarFord car, ColorCarFord color) {
        if (car != null && color != null && color != car.getColorCar()) {
            car.setColorCar(color);
        }
    }
}
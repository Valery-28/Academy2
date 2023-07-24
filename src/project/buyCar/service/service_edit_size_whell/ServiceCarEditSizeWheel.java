package project.buyCar.service.service_edit_size_whell;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.SizeWheelAUDI;
import project.buyCar.enums.enumBMW.SizeWheelBMW;
import project.buyCar.enums.enumFord.SizeWheelFord;

public class ServiceCarEditSizeWheel {
    public void changeWheel(CarAUDI car, SizeWheelAUDI sizeWheel) {
        if (car != null && sizeWheel != null && sizeWheel != car.getSizeWheelCar()) {
            car.setSizeWheelCar(sizeWheel);
        }
    }
    public void changeWheel(CarBMW car, SizeWheelBMW sizeWheel) {
        if (car != null && sizeWheel != null && sizeWheel != car.getSizeWheelCar()) {
            car.setSizeWheelCar(sizeWheel);
        }
    }
    public void changeWheel(CarFord car, SizeWheelFord sizeWheel) {
        if (car != null && sizeWheel != null && sizeWheel != car.getSizeWheelCar()) {
            car.setSizeWheelCar(sizeWheel);
        }
    }

}

package project.buyCar.service.service_edit_size_whell;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.SizeWheelAUDI;
import project.buyCar.enums.enumBMW.SizeWheelBMW;
import project.buyCar.enums.enumFord.SizeWheelFord;

public class ServiceCarEditSizeWheel {
    public void changeWheelAUDI(CarAUDI car, SizeWheelAUDI sizeWheel) {
        if (car != null && sizeWheel != null && sizeWheel != car.getSizeWheelCar()) {
            car.setSizeWheelCar(sizeWheel);
        }
    }
    public void changeWheelBMW(CarBMW car, SizeWheelBMW sizeWheel) {
        if (car != null && sizeWheel != null && sizeWheel != car.getSizeWheelCar()) {
            car.setSizeWheelCar(sizeWheel);
        }
    }
    public void changeWheelFord(CarFord car, SizeWheelFord sizeWheel) {
        if (car != null && sizeWheel != null && sizeWheel != car.getSizeWheelCar()) {
            car.setSizeWheelCar(sizeWheel);
        }
    }

}

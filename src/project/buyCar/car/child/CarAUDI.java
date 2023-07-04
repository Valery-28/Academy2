package project.buyCar.car.child;

import project.buyCar.car.parent.Car;
import project.buyCar.enums.enumModel.enumAudi.Drive;
import project.buyCar.enums.enumModel.enumAudi.ModelCarAUDI;
import project.buyCar.enums.enumCar.Brand;
import project.buyCar.enums.enumCar.CorolCar;
import project.buyCar.enums.enumCar.EngineCapacity;
import project.buyCar.enums.enumCar.SizeWheel;

import java.util.Set;

public class CarAUDI extends Car {

    private final ModelCarAUDI modelCarAUDI;
    private final Drive drive;


    public CarAUDI(ModelCarAUDI modelCarAUDI, CorolCar colorCar, EngineCapacity engineCapacity,
                   SizeWheel sizeWheel, Integer yearRelease, Set<String> option, Drive drive) {
        super(Brand.AUDI, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.modelCarAUDI = modelCarAUDI;
        this.drive = drive;

    }

    public Drive getDrive() {
        return drive;
    }

    public ModelCarAUDI getModelCarAUDI() {
        return modelCarAUDI;
    }


    @Override
    public String toString() {
        return "Model: " + getModelCarAUDI() + super.toString() + ", Drive type: " + getDrive();
    }
}

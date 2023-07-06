package project.buyCar.car.child;

import project.buyCar.car.parent.Car;
import project.buyCar.enums.enumAUDI.*;
import project.buyCar.enums.enumCar.Brand;
import java.util.Set;

public class CarAUDI extends Car {

    private final DriveForAUDI driveForAUDI;

    public CarAUDI(Brand brand, ModelCarAUDI modelCar, ColorCarAUDI colorCar, EngineCapacityAUDI engineCapacity,
                   SizeWheelAUDI sizeWheel, Integer yearRelease, Set<String> option,DriveForAUDI driveForAUDI) {
        super(brand, modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.driveForAUDI = driveForAUDI;
    }

    public DriveForAUDI getDriveForAUDI() {
        return driveForAUDI;
    }

    @Override
    public String toString() {
        return super.toString() + ", Drive type: " + getDriveForAUDI();
    }
}

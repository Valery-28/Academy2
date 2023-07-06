package project.buyCar.car.child;

import project.buyCar.car.parent.AbstractCar;
import project.buyCar.enums.enumAUDI.ColorCarAUDI;
import project.buyCar.enums.enumAUDI.DriveForAUDI;
import project.buyCar.enums.enumAUDI.EngineCapacityAUDI;
import project.buyCar.enums.enumAUDI.ModelCarAUDI;
import project.buyCar.enums.enumAUDI.SizeWheelAUDI;

import java.util.Set;

public class CarAUDI extends AbstractCar {
    private final DriveForAUDI driveForAUDI;

    public CarAUDI(ModelCarAUDI modelCar, ColorCarAUDI colorCar, EngineCapacityAUDI engineCapacity,
                   SizeWheelAUDI sizeWheel, Integer yearRelease, Set<String> option, DriveForAUDI driveForAUDI) {
        super(modelCar, colorCar, engineCapacity, sizeWheel, yearRelease, option);
        this.driveForAUDI = driveForAUDI;
    }

    public DriveForAUDI getDriveForAUDI() {
        return driveForAUDI;
    }

    @Override
    public String toString() {
        String BRAND = "AUDI";
        return "Brand: "+ BRAND + super.toString() + ", Drive type: " + getDriveForAUDI();
    }
}

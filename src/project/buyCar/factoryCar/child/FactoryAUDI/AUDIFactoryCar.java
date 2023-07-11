package project.buyCar.factoryCar.child.FactoryAUDI;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.enums.enumAUDI.*;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;
import project.buyCar.interfaces.ColorCar;
import project.buyCar.interfaces.EngineCapacityCar;
import project.buyCar.interfaces.ModelCar;
import project.buyCar.interfaces.SizeWheelCar;

import java.util.Arrays;
import java.util.Set;

public class AUDIFactoryCar extends AbstractFactoryCar<ModelCarAUDI, ColorCarAUDI, EngineCapacityAUDI, SizeWheelAUDI,CarAUDI,DriveForAUDI> {
    final int YEAR_RELEASE = 2022;
    public DriveForAUDI[] allDriveForAUDI;

    public AUDIFactoryCar(ModelCarAUDI[] allModelCar, ColorCarAUDI[] allCoralCar,
                          EngineCapacityAUDI[] allEngineCapacity, SizeWheelAUDI[] allSizeWheel,
                          DriveForAUDI[] allDriveForAUDI) {
        super(allModelCar, allCoralCar, allEngineCapacity, allSizeWheel);
        this.allDriveForAUDI = allDriveForAUDI;

    }
    @Override
    public String getConfigurations() {
        return super.getConfigurations() + "drive type: " + Arrays.toString(allDriveForAUDI) + "\n";
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public CarAUDI create(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                          SizeWheelCar sizeWheelCar, Set<String> option,DriveForAUDI function) {
        return new CarAUDI((ModelCarAUDI) modelCar,(ColorCarAUDI) colorCar,(EngineCapacityAUDI) engineCapacityCar,
                (SizeWheelAUDI) sizeWheelCar,YEAR_RELEASE,option,function);
    }
}

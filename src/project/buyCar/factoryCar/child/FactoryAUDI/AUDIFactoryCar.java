package project.buyCar.factoryCar.child.FactoryAUDI;


import project.buyCar.car.child.CarAUDI;
import project.buyCar.enums.enumAUDI.*;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;


import java.util.Arrays;
import java.util.Set;

public class AUDIFactoryCar extends AbstractFactoryCar {
    final int YEAR_RELEASE = 2022;
    private final ModelCarAUDI[] allModelCarAUDI = ModelCarAUDI.values();
    private final ColorCarAUDI[] allCoralCarAUDI = ColorCarAUDI.values();
    private final EngineCapacityAUDI[] allEngineCapacityAUDI = EngineCapacityAUDI.values();
    private final SizeWheelAUDI[] allSizeWheelAUDI = SizeWheelAUDI.values();

    public void print() {
        System.out.printf("""
                        Welcome to Audi Factory, the following cars are made here:
                        Available Models: %s
                        Available colors: %s
                        Available engine size: %s
                        Available wheel size: %s
                        """,
                Arrays.toString(allModelCarAUDI),
                Arrays.toString(allCoralCarAUDI),
                Arrays.toString(allEngineCapacityAUDI),
                Arrays.toString(allSizeWheelAUDI)
        );
    }

    public  CarAUDI create(ModelCarAUDI modelCar, ColorCarAUDI colorCar, EngineCapacityAUDI engineCapacity,
                          SizeWheelAUDI sizeWheel, Set<String> option, DriveForAUDI driveForAUDI) {
        return new CarAUDI(modelCar, colorCar, engineCapacity, sizeWheel, YEAR_RELEASE, option, driveForAUDI);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

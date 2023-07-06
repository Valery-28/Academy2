package project.buyCar.factoryCar.child.FactoryFord;

import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumFord.ColorCarFord;
import project.buyCar.enums.enumFord.EngineCapacityFord;
import project.buyCar.enums.enumFord.ModelCarFord;
import project.buyCar.enums.enumFord.SizeWheelFord;
import project.buyCar.factoryCar.parent.AbstractFactoryCar;

import java.util.Arrays;
import java.util.Set;

public class FordFactoryCar extends AbstractFactoryCar {
    final int YEAR_RELEASE = 2022;
    private final ModelCarFord[] allModelCarFord = ModelCarFord.values();
    private final ColorCarFord[] allCoralCarFord = ColorCarFord.values();
    private final EngineCapacityFord[] allEngineCapacityFord = EngineCapacityFord.values();
    private final SizeWheelFord[] allSizeWheelFord = SizeWheelFord.values();

    public void print() {
        System.out.printf("""
                        Welcome to Ford Factory, the following cars are made here:
                        Available Models: %s
                        Available colors: %s
                        Available engine size: %s
                        Available wheel size: %s
                        """,
                Arrays.toString(allModelCarFord),
                Arrays.toString(allCoralCarFord),
                Arrays.toString(allEngineCapacityFord),
                Arrays.toString(allSizeWheelFord)
        );
    }
    public CarFord create(ModelCarFord modelCar, ColorCarFord colorCar, EngineCapacityFord engineCapacity,
                   SizeWheelFord sizeWheel, Set<String> option,Boolean isThereAHatch){
        return new CarFord(modelCar,colorCar,engineCapacity,sizeWheel,YEAR_RELEASE,option,isThereAHatch);
    }
}

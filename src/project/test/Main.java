package project.test;

import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.*;
import project.buyCar.enums.enumBMW.*;
import project.buyCar.enums.enumFord.*;
import project.buyCar.factoryCar.child.FactoryAUDI.AUDIFactoryCar;
import project.buyCar.factoryCar.child.FactoryBMW.BMWFactoryCar;
import project.buyCar.factoryCar.child.FactoryFord.FordFactoryCar;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AUDIFactoryCar audiFactoryCar = new AUDIFactoryCar(ModelCarAUDI.values(), ColorCarAUDI.values(),
                EngineCapacityAUDI.values(), SizeWheelAUDI.values(), DriveForAUDI.values());
        BMWFactoryCar bmwFactoryCar = new BMWFactoryCar(ModelCarBMW.values(), ColorCarBMW.values(),
                EngineCapacityBMW.values(), SizeWheelBMW.values());
        FordFactoryCar fordFactoryCar = new FordFactoryCar(ModelCarFord.values(), ColorCarFord.values(),
                EngineCapacityFord.values(), SizeWheelFord.values());


        System.out.println(audiFactoryCar.getConfigurations());
        System.out.println(bmwFactoryCar.getConfigurations());
        System.out.println(fordFactoryCar.getConfigurations());


        CarAUDI carAUDI = new CarAUDI(ModelCarAUDI.A7, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX,
                SizeWheelAUDI.R16, 2022, null, DriveForAUDI.FRONT_DRIVE);
        System.out.println(carAUDI);
        CarBMW carBMW = new CarBMW(ModelCarBMW.I8, ColorCarBMW.ORANGE, EngineCapacityBMW.MAX, SizeWheelBMW.R19,
                2022, new HashSet<>(Set.of("Climate control")), 6);
        System.out.println(carBMW);
        CarFord carFord = new CarFord(ModelCarFord.ESCALATE, ColorCarFord.RED,
                EngineCapacityFord.MAX, SizeWheelFord.R16,
                2022, new HashSet<>(Set.of("Rain sensor")), true);
        System.out.println(carFord);
        System.out.println();
        audiFactoryCar.getConfigurations();
        System.out.println(audiFactoryCar.create(ModelCarAUDI.A6, ColorCarAUDI.GREEN, EngineCapacityAUDI.MIN, SizeWheelAUDI.R19,
                new HashSet<>(Set.of("Light sensor")), DriveForAUDI.FRONT_DRIVE));
        System.out.println();
        System.out.println(bmwFactoryCar.create(ModelCarBMW.X5, ColorCarBMW.WHITE, EngineCapacityBMW.STANDARD,
                SizeWheelBMW.R19, null, 7));
        System.out.println();
        System.out.println(fordFactoryCar.create(ModelCarFord.FOCUS, ColorCarFord.PURPLE,
                EngineCapacityFord.STANDARD, SizeWheelFord.R15,
                new HashSet<>(Set.of("Rain sensor")), true));
    }
}

package project.test;

import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.*;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumBMW.EngineCapacityBMW;
import project.buyCar.enums.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumBMW.SizeWheelBMW;
import project.buyCar.enums.enumFord.ColorCarFord;
import project.buyCar.enums.enumFord.EngineCapacityFord;
import project.buyCar.enums.enumFord.ModelCarFord;
import project.buyCar.enums.enumFord.SizeWheelFord;
import project.buyCar.factoryCar.child.FactoryAUDI.AUDIFactoryCar;
import project.buyCar.factoryCar.child.FactoryBMW.BMWFactoryCar;
import project.buyCar.factoryCar.child.FactoryFord.FordFactoryCar;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AUDIFactoryCar audiFactoryCar = new AUDIFactoryCar();
        BMWFactoryCar bmwFactoryCar = new BMWFactoryCar();
        FordFactoryCar fordFactoryCar = new FordFactoryCar();
        CarAUDI carAUDI = new CarAUDI(ModelCarAUDI.A7, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX,
                SizeWheelAUDI.R16, 2022, null, project.buyCar.enums.enumAUDI.DriveForAUDI.FRONT_DRIVE);
        System.out.println(carAUDI);
        CarBMW carBMW = new CarBMW(ModelCarBMW.I8, ColorCarBMW.ORANGE, EngineCapacityBMW.MAX, SizeWheelBMW.R19,
                2022, new HashSet<>(Set.of("Climate control")));
        System.out.println(carBMW);
        CarFord carFord = new CarFord(ModelCarFord.ESCALATE, ColorCarFord.RED,
                EngineCapacityFord.MAX, SizeWheelFord.R16,
                2022, new HashSet<>(Set.of("Rain sensor")), true);
        System.out.println(carFord);
        System.out.println();
        audiFactoryCar.print();
        System.out.println(audiFactoryCar.create(ModelCarAUDI.A6,ColorCarAUDI.GREEN,EngineCapacityAUDI.MIN,SizeWheelAUDI.R19,
                new HashSet<>(Set.of("Light senor")), DriveForAUDI.REAR_DRIVE));
        System.out.println();
        bmwFactoryCar.print();
        System.out.println(bmwFactoryCar.create(ModelCarBMW.X5, ColorCarBMW.WHITE, EngineCapacityBMW.STANDARD,
                SizeWheelBMW.R19, null));
        System.out.println();
        fordFactoryCar.print();
        System.out.println(fordFactoryCar.create(ModelCarFord.FOCUS, ColorCarFord.PURPLE,
                EngineCapacityFord.STANDARD, SizeWheelFord.R15,
                new HashSet<>(Set.of("Rain sensor")), true));
    }
}

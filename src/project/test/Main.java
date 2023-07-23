package project.test;

import project.buyCar.additional_function.AdditionalFunctionAUDI;
import project.buyCar.additional_function.AdditionalFunctionBMW;
import project.buyCar.additional_function.AdditionalFunctionFord;
import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.ColorCarAUDI;
import project.buyCar.enums.enumAUDI.EngineCapacityAUDI;
import project.buyCar.enums.enumAUDI.ModelCarAUDI;
import project.buyCar.enums.enumAUDI.SizeWheelAUDI;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumBMW.EngineCapacityBMW;
import project.buyCar.enums.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumBMW.SizeWheelBMW;
import project.buyCar.enums.enumFord.ColorCarFord;
import project.buyCar.enums.enumFord.EngineCapacityFord;
import project.buyCar.enums.enumFord.ModelCarFord;
import project.buyCar.enums.enumFord.SizeWheelFord;
import project.buyCar.factory_car.child.factory_audi.AUDIFactoryCar;
import project.buyCar.factory_car.child.factory_bmw.BMWFactoryCar;
import project.buyCar.factory_car.child.factory_ford.FordFactoryCar;
import project.buyCar.service.service_edit_colar.ServiceCarEditColor;
import project.buyCar.service.service_edit_option.ServiceCarEditOption;
import project.buyCar.service.service_edit_size_whell.ServiceCarEditSizeWheel;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        ServiceCarEditColor serviceCarEditColor = new ServiceCarEditColor();
        ServiceCarEditOption serviceCarEditOption = new ServiceCarEditOption();
        ServiceCarEditSizeWheel serviceCarEditSizeWheel = new ServiceCarEditSizeWheel();
        AUDIFactoryCar audiFactoryCar = new AUDIFactoryCar(ModelCarAUDI.values(), ColorCarAUDI.values(),
                EngineCapacityAUDI.values(), SizeWheelAUDI.values());
        BMWFactoryCar bmwFactoryCar = new BMWFactoryCar(ModelCarBMW.values(), ColorCarBMW.values(),
                EngineCapacityBMW.values(), SizeWheelBMW.values());
        FordFactoryCar fordFactoryCar = new FordFactoryCar(ModelCarFord.values(), ColorCarFord.values(),
                EngineCapacityFord.values(), SizeWheelFord.values());

        System.out.println();
        System.out.println("AUDI " + audiFactoryCar.getConfigurations());
        audiFactoryCar.storage.getStorage();
        System.out.println();
        System.out.println("BMW " + bmwFactoryCar.getConfigurations());
        bmwFactoryCar.storage.getStorage();
        System.out.println();
        System.out.println("Ford " + fordFactoryCar.getConfigurations());
        fordFactoryCar.storage.getStorage();
        System.out.println();

        CarAUDI carAUDI = new CarAUDI(ModelCarAUDI.A7, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX,
                SizeWheelAUDI.R16, 2022, new HashSet<>(Set.of("Road control")),
                new AdditionalFunctionAUDI(true, 10000));
        System.out.println(carAUDI);
        CarBMW carBMW = new CarBMW(ModelCarBMW.I8, ColorCarBMW.ORANGE, EngineCapacityBMW.MAX, SizeWheelBMW.R19,
                2022, new HashSet<>(Set.of("Climate control")), new AdditionalFunctionBMW(3, true));
        System.out.println(carBMW);
        CarFord carFord = new CarFord(ModelCarFord.ESCALATE, ColorCarFord.RED,
                EngineCapacityFord.MAX, SizeWheelFord.R16,
                2022, new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionFord(true));
        System.out.println(carFord);

        System.out.println();

        System.out.println(audiFactoryCar.create(ModelCarAUDI.A6, ColorCarAUDI.GREEN, EngineCapacityAUDI.MIN, SizeWheelAUDI.R19,
                new HashSet<>(Set.of("Light sensor")), new AdditionalFunctionAUDI(false, 8000)));
        System.out.println(audiFactoryCar.create(ModelCarAUDI.A7, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX,
                SizeWheelAUDI.R16, new HashSet<>(Set.of("Road control")), new AdditionalFunctionAUDI(true, 10000)));
        audiFactoryCar.storage.getStorage();
        System.out.println();
        System.out.println(bmwFactoryCar.create(ModelCarBMW.X5, ColorCarBMW.WHITE, EngineCapacityBMW.STANDARD,
                SizeWheelBMW.R19, new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionBMW(5, true)));
        System.out.println();
        System.out.println(fordFactoryCar.create(ModelCarFord.FOCUS, ColorCarFord.PURPLE,
                EngineCapacityFord.STANDARD, SizeWheelFord.R15,
                new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionFord(true)));
        System.out.println();


        serviceCarEditColor.editCarColorAUDI(carAUDI, ColorCarAUDI.GREEN);
        serviceCarEditSizeWheel.changeWheelAUDI(carAUDI,SizeWheelAUDI.R19);
        serviceCarEditOption.addOptionAUDI(carAUDI, "Climate control");
        serviceCarEditOption.deleteOptionAUDI(carAUDI,"Road control");
        serviceCarEditOption.setOptionsAUDI(carAUDI,new HashSet<>(Set.of("Light Sensor")));
        System.out.println(carAUDI);


        serviceCarEditColor.editCarColorBMW(carBMW, ColorCarBMW.ORANGE);
        serviceCarEditSizeWheel.changeWheelBMW(carBMW,SizeWheelBMW.R18);
        serviceCarEditOption.addOptionBMW(carBMW,"Light sensor");
        serviceCarEditOption.deleteOptionBMW(carBMW,"Climate control");
        serviceCarEditOption.setOptionsBMW(carBMW,new HashSet<>(Set.of("Road Sensor")));
        System.out.println(carBMW);


        serviceCarEditColor.editCarColorFord(carFord, ColorCarFord.PURPLE);
        serviceCarEditSizeWheel.changeWheelFord(carFord,SizeWheelFord.R14);
        serviceCarEditOption.addOptionFord(carFord,"Light sensor");
        serviceCarEditOption.deleteOptionFord(carFord,"Climate control");
        serviceCarEditOption.setOptionsFord(carFord,new HashSet<>(Set.of("Road Sensor")));
        System.out.println(carFord);
        System.out.println();
    }
}

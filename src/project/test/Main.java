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
import project.buyCar.showroom.ShowRoom;

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
        ShowRoom showRoom = new ShowRoom(audiFactoryCar, bmwFactoryCar, fordFactoryCar,
                serviceCarEditColor, serviceCarEditSizeWheel, serviceCarEditOption);

        System.out.println("Завод Ауди");
        System.out.println("AUDI " + audiFactoryCar.getConfigurations());
        audiFactoryCar.storage.getStorage();
        System.out.println("Завод бмв");
        System.out.println("BMW " + bmwFactoryCar.getConfigurations());
        bmwFactoryCar.storage.getStorage();
        System.out.println("Завод форд");
        System.out.println("Ford " + fordFactoryCar.getConfigurations());
        fordFactoryCar.storage.getStorage();
        System.out.println();

        System.out.println("Создание объектов Car");
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
        System.out.println("Создание машин через завод");
        System.out.println(audiFactoryCar.create(ModelCarAUDI.A5, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX, SizeWheelAUDI.R16,
                new HashSet<>(Set.of("Road control")), new AdditionalFunctionAUDI(true, 10000)));
        System.out.println(audiFactoryCar.create(ModelCarAUDI.A7, ColorCarAUDI.BLACK, EngineCapacityAUDI.MAX,
                SizeWheelAUDI.R16, new HashSet<>(Set.of("Road control")), new AdditionalFunctionAUDI(true, 10000)));
        System.out.println(bmwFactoryCar.create(ModelCarBMW.X5, ColorCarBMW.WHITE, EngineCapacityBMW.MAX,
                SizeWheelBMW.R19, new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionBMW(5, true)));
        System.out.println(fordFactoryCar.create(ModelCarFord.FOCUS, ColorCarFord.PURPLE,
                EngineCapacityFord.STANDARD, SizeWheelFord.R15,
                new HashSet<>(Set.of("Rain sensor")), new AdditionalFunctionFord(true)));
        System.out.println();

        System.out.println("Изменение машин через сервис");
        serviceCarEditColor.editCarColor(carAUDI, ColorCarAUDI.GREEN);
        serviceCarEditSizeWheel.changeWheel(carAUDI, SizeWheelAUDI.R19);
        serviceCarEditOption.addOption(carAUDI, "Climate control");
        serviceCarEditOption.deleteOption(carAUDI, "Road control");
        serviceCarEditOption.setOptions(carAUDI, new HashSet<>(Set.of("Light Sensor")));
        System.out.println(carAUDI);


        serviceCarEditColor.editCarColor(carBMW, ColorCarBMW.ORANGE);
        serviceCarEditSizeWheel.changeWheel(carBMW, SizeWheelBMW.R18);
        serviceCarEditOption.addOption(carBMW, "Light sensor");
        serviceCarEditOption.deleteOption(carBMW, "Climate control");
        serviceCarEditOption.setOptions(carBMW, new HashSet<>(Set.of("Road Sensor")));
        System.out.println(carBMW);


        serviceCarEditColor.editCarColor(carFord, ColorCarFord.PURPLE);
        serviceCarEditSizeWheel.changeWheel(carFord, SizeWheelFord.R14);
        serviceCarEditOption.addOption(carFord, "Light sensor");
        serviceCarEditOption.deleteOption(carFord, "Climate control");
        serviceCarEditOption.setOptions(carFord, new HashSet<>(Set.of("Road Sensor")));
        System.out.println(carFord);
        System.out.println();

        System.out.println("Закупка салонам авто с разных заводов и изменения авто через сервисы");
        CarBMW car1 = showRoom.sellCar(ModelCarBMW.X5, ColorCarBMW.WHITE,
                EngineCapacityBMW.MAX, SizeWheelBMW.R19, new HashSet<>(Set.of("Rain sensor")),
                new AdditionalFunctionBMW(5, true));
        showRoom.SalonEditColor(car1, ColorCarBMW.ORANGE);
        showRoom.SalonAddOption(car1, "Light sensor");
        showRoom.SalonDeleteOption(car1, "Rain sensor");
        showRoom.SalonSetOptions(car1, Set.of("Light sensor, Road control"));
        showRoom.SalonEditSizeWheel(car1, SizeWheelBMW.R20);
        System.out.println(car1);

        CarAUDI car2 = showRoom.sellCar(ModelCarAUDI.A4, ColorCarAUDI.GREEN,
                EngineCapacityAUDI.MAX, SizeWheelAUDI.R19, new HashSet<>(Set.of("Light sensor")),
                new AdditionalFunctionAUDI(true, 8000));
        showRoom.SalonEditColor(car2, ColorCarAUDI.BLACK);
        showRoom.SalonAddOption(car2, "Light sensor");
        showRoom.SalonDeleteOption(car2, "Rain sensor");
        showRoom.SalonSetOptions(car2, Set.of("Light sensor, Road control"));
        showRoom.SalonEditSizeWheel(car2, SizeWheelAUDI.R18);
        System.out.println(car2);

        CarFord car3 = showRoom.sellCar(ModelCarFord.ESCALATE, ColorCarFord.RED,
                EngineCapacityFord.MAX, SizeWheelFord.R16, new HashSet<>(Set.of("Climate control")),
                new AdditionalFunctionFord(true));
        showRoom.SalonEditColor(car3, ColorCarFord.PURPLE);
        showRoom.SalonAddOption(car3, "Light sensor");
        showRoom.SalonDeleteOption(car3, "Rain sensor");
        showRoom.SalonSetOptions(car3, Set.of("Light sensor, Road control"));
        showRoom.SalonEditSizeWheel(car3, SizeWheelFord.R17);
        System.out.println(car3);
        System.out.println();

        System.out.println("Состояние складов после всех закупок");
        System.out.println();
        System.out.println("AUDI");
        audiFactoryCar.storage.getStorage();
        System.out.println();
        System.out.println("BMW");
        bmwFactoryCar.storage.getStorage();
        System.out.println();
        System.out.println("Ford");
        fordFactoryCar.storage.getStorage();

    }
}
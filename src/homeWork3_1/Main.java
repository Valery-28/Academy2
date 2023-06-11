package homeWork3_1;

import homeWork3_1.classes.*;
import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        ServiceCar serviceCar = new ServiceCar();
        ArrayList<Car> cars = new ArrayList<>();
        Stock stock = new Stock(cars);
        FactoryCar factoryCar = new FactoryCar(stock,2023);


        cars.add(factoryCar.create(ModelCar.CHEVROLET, CoralCar.PURPLE, EngineCapasity.STANDARD,
                SizeWheel.R16, new HashSet<>(Set.of("Rain, sensor", "Light sensor", "Climate control"))));
        cars.add(factoryCar.create(ModelCar.AUDI, CoralCar.WHITE, EngineCapasity.STANDARD,
                SizeWheel.R15, new HashSet<>(Set.of("Climate control", "Patronymic"))));
        cars.add(factoryCar.create(ModelCar.BMW, CoralCar.WHITE, EngineCapasity.BIG,
                SizeWheel.R16, null));

        SalonCar salonCar = new SalonCar(factoryCar, serviceCar);

        factoryCar.print();

        System.out.println("All models year release: " + factoryCar.getYEAR_RELEASE());
        System.out.println(stock.getStoke());
        System.out.println();
        System.out.println("We have the following vehicles in stock:");

        serviceCar.deleteOption(stock.getStoke().get(0), "Rain sensor");
        serviceCar.setOptions(stock.getStoke().get(2), new HashSet<>(Set.of("Climate control", "Patronymic")));
        serviceCar.editCarColor(stock.getStoke().get(0), CoralCar.ORANGE);
        System.out.println(stock.getStoke());

        Car car1 = salonCar.sellCar(ModelCar.BMW, CoralCar.BLACK, EngineCapasity.BIG,
                SizeWheel.R19, new HashSet<>(Set.of("Rain, sensor", "Light sensor", "Climate control")));
        Car car2 = salonCar.sellCar(ModelCar.SKODA, CoralCar.GREEN, EngineCapasity.STANDARD,
                SizeWheel.R15, null);
        Car car3 = salonCar.sellCar(ModelCar.CHEVROLET, CoralCar.ORANGE, EngineCapasity.STANDARD,
                SizeWheel.R15, new HashSet<>(Set.of("Rain, sensor", "Light sensor", "Climate control")));
        Car car4 = salonCar.sellCar(ModelCar.AUDI, CoralCar.RED, EngineCapasity.STANDARD,
                SizeWheel.R17, new HashSet<>(Set.of("Standard function")));


        System.out.println();
        System.out.println();
        System.out.println("Create salon Car1" + car1);
        System.out.println("Create salon Car2" + car2);
        System.out.println("Create salon Car3" + car3);
        System.out.println("Create salon Car4" + car4);
        System.out.println();
        System.out.println("STOKE"+stock.getStoke());

        salonCar.getServiceCar().changeWheel(car1, SizeWheel.R17);
        salonCar.getServiceCar().editCarColor(car3, CoralCar.ORANGE);
        salonCar.getServiceCar().deleteOption(car2, "Climate control");
        salonCar.getServiceCar().addOption(car2, "options33");
        salonCar.getServiceCar().addOption(car3, "options24");
        salonCar.getServiceCar().setOptions(car1, new HashSet<>(Set.of("Climate control", "Patronymic")));
        salonCar.getServiceCar().editCarColor(car1, CoralCar.YELOW);


        System.out.println();
        System.out.println("Change service car1" + car1);
        System.out.println("Change salon car2" + car2);
        System.out.println("change salon car3" + car3);
        System.out.println("Change salon car4" + car4);
        System.out.println();
    }
}

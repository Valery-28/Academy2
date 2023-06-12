package homeWork3_1.app;

import homeWork3_1.classes.object.Car;
import homeWork3_1.classes.services.SalonCar;
import homeWork3_1.classes.services.ServiceCar;
import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;
import homeWork3_1.classes.factory.FactoryCar;
import homeWork3_1.classes.factory.Stock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        ServiceCar serviceCar = new ServiceCar();
        ArrayList<Car> cars = new ArrayList<>();
        Stock stock = new Stock(cars);
        FactoryCar factoryCar = new FactoryCar(stock);

        factoryCar.print();

        System.out.println();

        cars.add(factoryCar.create(ModelCar.CHEVROLET, CoralCar.PURPLE, EngineCapasity.STANDARD,
                SizeWheel.R16, new HashSet<>(Set.of("Rain sensor", "Light sensor", "Climate control"))));
        cars.add(factoryCar.create(ModelCar.AUDI, CoralCar.WHITE, EngineCapasity.STANDARD,
                SizeWheel.R15, new HashSet<>(Set.of("Climate control"))));
        cars.add(factoryCar.create(ModelCar.BMW, CoralCar.WHITE, EngineCapasity.BIG,
                SizeWheel.R16, null));

        SalonCar salonCar = new SalonCar(factoryCar, serviceCar);

        System.out.println("Stoke:\n" + cars);

        System.out.println();

        System.out.println("We have the following vehicles in stock:");

        serviceCar.deleteOption(cars.get(0), "Rain sensor");
        serviceCar.setOptions(cars.get(1), new HashSet<>(Set.of("Climate control", "Patronymic")));
        serviceCar.editCarColor(cars.get(0), CoralCar.ORANGE);

        System.out.println("Stoke:\n" + cars);

        Car car1 = salonCar.sellCar(ModelCar.BMW, CoralCar.BLACK, EngineCapasity.BIG,
                SizeWheel.R19, new HashSet<>(Set.of("Rain, sensor", "Light sensor", "Climate control")));
        Car car2 = salonCar.sellCar(ModelCar.SKODA, CoralCar.GREEN, EngineCapasity.STANDARD,
                SizeWheel.R15, new HashSet<>(Set.of("Rain sensor", "Light sensor", "Climate control")));
        Car car3 = salonCar.sellCar(ModelCar.PEUGEOT, CoralCar.ORANGE, EngineCapasity.STANDARD,
                SizeWheel.R15, new HashSet<>(Set.of("Rain, sensor", "Light sensor", "Climate control")));
        Car car4 = salonCar.sellCar(ModelCar.KIA, CoralCar.RED, EngineCapasity.STANDARD,
                SizeWheel.R17, new HashSet<>(Set.of("Standard function")));

        System.out.println();

        System.out.println("Create salon Car1" + car1);
        System.out.println("Create salon Car2" + car2);
        System.out.println("Create salon Car3" + car3);
        System.out.println("Create salon Car4" + car4);

        System.out.println();

        System.out.println("STOKE" + cars);

        salonCar.editSizeWheelSalon(car1, SizeWheel.R17);
        salonCar.editColorSalon(car3, CoralCar.ORANGE);
        salonCar.deleteOptionSalon(car2, "Climate control");
        salonCar.addOptionSalon(car2, "options33");
        salonCar.addOptionSalon(car3, "options24");
        salonCar.setOptionSalon(car1, new HashSet<>(Set.of("Climate control", "Patronymic")));
        salonCar.editColorSalon(car1, CoralCar.YELOW);

        System.out.println();

        System.out.println("Change service car1" + car1);
        System.out.println("Change salon car2" + car2);
        System.out.println("change salon car3" + car3);
        System.out.println("Change salon car4" + car4);

        System.out.println();
        salonCar.factoryStay();
    }
}

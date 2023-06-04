package homeWork3_1;

import homeWork3_1.classes.Car;
import homeWork3_1.classes.FactoryCar;
import homeWork3_1.classes.SalonCar;
import homeWork3_1.classes.ServiceCar;
import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ServiceCar serviceCar = new ServiceCar();
        FactoryCar factoryCar = new FactoryCar();
        SalonCar salonCar = new SalonCar(factoryCar, serviceCar);

        factoryCar.print();

        factoryCar.create(ModelCar.AUDI, CoralCar.BLUE, EngineCapasity.BIG,
                SizeWheel.R17, 2020, new ArrayList<>(Arrays.asList("option1", "option2")));
        factoryCar.create(ModelCar.BMW, CoralCar.BLUE, EngineCapasity.BIG,
                SizeWheel.R17, 2021, new ArrayList<>());
        factoryCar.create(ModelCar.CHEVROLET, CoralCar.PURPLE, EngineCapasity.STANDARD,
                SizeWheel.R16, 2017, new ArrayList<>(List.of("option1")));
        System.out.println("We have the following vehicles in stock:");

        System.out.println(factoryCar.getStock());

        serviceCar.addOption(factoryCar.getStock().get(1), "option1");
        serviceCar.deleteOption(factoryCar.getStock().get(0), "option1");
        serviceCar.setOptions(factoryCar.getStock().get(2), new ArrayList<>(List.of("option3")));
        serviceCar.editCarColor(factoryCar.getStock().get(0), CoralCar.GREEN);
        serviceCar.changeWheel(factoryCar.getStock().get(2), SizeWheel.R15);

        System.out.println();
        System.out.println("Change stoke: ");
        System.out.println(factoryCar.getStock());
        System.out.println();

        Car car1 = salonCar.sellCar(ModelCar.PEUGEOT, CoralCar.PURPLE, EngineCapasity.STANDARD,
                SizeWheel.R18, 2023, new ArrayList<>(Arrays.asList("option4", "option5")));
        Car car2 = salonCar.sellCar(ModelCar.CHEVROLET, CoralCar.PURPLE, EngineCapasity.STANDARD,
                SizeWheel.R16, 2017, new ArrayList<>(List.of("option1")));
        Car car3 = salonCar.sellCar(ModelCar.AUDI, CoralCar.WHITE, EngineCapasity.STANDARD,
                SizeWheel.R19, 2020, new ArrayList<>(List.of()));
        Car car4 = salonCar.sellCar(ModelCar.AUDI, CoralCar.WHITE, EngineCapasity.BIG,
                SizeWheel.R19, 2020, new ArrayList<>(List.of()));

        System.out.println("Create salon Car1" + car1);
        System.out.println();
        System.out.println("Create salon Car2" + car2);
        System.out.println();
        System.out.println("Create salon Car3" + car3);
        System.out.println();
        System.out.println("Create salon Car4" + car4);
        System.out.println();

        salonCar.changeWheel(car2, SizeWheel.R15);
        salonCar.editCarColor(car3, CoralCar.ORANGE);
        salonCar.deleteOption(car2, "option1");
        salonCar.addOption(car2, "options33");
        salonCar.addOption(car3, "options24");
        salonCar.setOptions(car1, new ArrayList<>(List.of("Options23")));

        System.out.println("Change salon car1" + car1);
        System.out.println();
        System.out.println("Change salon car2" + car2);
        System.out.println();
        System.out.println("change salon car3" + car3);
        System.out.println();
        System.out.println("Change salon car4" + car4);
        System.out.println();

        System.out.println("Change stoke" + factoryCar.getStock());

    }
}

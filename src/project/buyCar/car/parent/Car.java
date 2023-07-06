package project.buyCar.car.parent;


import project.buyCar.enums.enumCar.Brand;
import project.buyCar.interfaces.ColorCar;
import project.buyCar.interfaces.EngineCapacityCar;
import project.buyCar.interfaces.ModelCar;
import project.buyCar.interfaces.SizeWheelCar;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Car implements ModelCar, ColorCar, EngineCapacityCar, SizeWheelCar {
    private final Brand brand;
    private final ModelCar modelCar;
    private final ColorCar colorCar;
    private final EngineCapacityCar engineCapacityCar;
    private final  SizeWheelCar sizeWheelCar;
    private final Integer yearRelease;
    private final Set<String> option;


    public Car(Brand brand,ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
               SizeWheelCar sizeWheelCar, Integer yearRelease, Set<String> option) {
        this.brand = brand;
        this.modelCar=modelCar;
        this.colorCar=colorCar;
        this.engineCapacityCar=engineCapacityCar;
        this.sizeWheelCar=sizeWheelCar;
        this.yearRelease = yearRelease;
        this.option = Objects.requireNonNullElseGet(option, () -> new HashSet<>(Set.of()));
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                ", Model: " + modelCar +
                ", Color: " + colorCar +
                ", Engine size: " + engineCapacityCar +
                ", Size Wheel: " + sizeWheelCar +
                ", Year release: " + yearRelease +
                ", options: " + option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand == car.brand && modelCar == car.modelCar
                && engineCapacityCar == car.engineCapacityCar && yearRelease.equals(car.yearRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand ,modelCar, engineCapacityCar, yearRelease);
    }

}

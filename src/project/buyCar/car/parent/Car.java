package project.buyCar.car.parent;


import project.buyCar.enums.enumCar.Brand;
import project.buyCar.enums.enumCar.CorolCar;
import project.buyCar.enums.enumCar.EngineCapacity;
import project.buyCar.enums.enumCar.SizeWheel;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Car {
    private final Brand brand;
    private CorolCar colorCar;
    private EngineCapacity engineCapacity;
    private SizeWheel sizeWheel;
    private final Integer yearRelease;
    private final Set<String> option;


    public Car(Brand modelCar, CorolCar colorCar, EngineCapacity engineCapacity,
               SizeWheel sizeWheel, Integer yearRelease, Set<String> option) {
        this.brand = modelCar;
        checkEngineCapacity(engineCapacity);
        checkColor(colorCar);
        checkSizeWheel(sizeWheel);
        this.yearRelease = yearRelease;
        this.option = Objects.requireNonNullElseGet(option, () -> new HashSet<>(Set.of()));
    }

    @Override
    public String toString() {
        return ", Brand: " + brand +
                ", Color: " + colorCar +
                ", Engine size: " + engineCapacity +
                ", Size Wheel: " + sizeWheel +
                ", Year release: " + yearRelease +
                ", options: " + option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand == car.brand && engineCapacity == car.engineCapacity && yearRelease.equals(car.yearRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, engineCapacity, yearRelease);
    }
    public void checkColor(CorolCar colorCar){
        for (CorolCar c : brand.getColorCars()) {
            if (c == colorCar) {
                this.colorCar=colorCar;
                break;
            }
        }
    }
    public void checkEngineCapacity(EngineCapacity engineCapacity){
        for (EngineCapacity c : brand.getEngineCapacities()) {
            if (c == engineCapacity) {
                this.engineCapacity = engineCapacity;
                break;
            }
        }
    }
    public void checkSizeWheel(SizeWheel sizeWheel){
        for (SizeWheel c : brand.getSizeWheels()) {
            if (c == sizeWheel) {
                this.sizeWheel = sizeWheel;
                break;
            }
        }
    }

}

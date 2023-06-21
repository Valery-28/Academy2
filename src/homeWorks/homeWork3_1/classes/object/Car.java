package homeWorks.homeWork3_1.classes.object;

import homeWorks.homeWork3_1.enums.CoralCar;
import homeWorks.homeWork3_1.enums.EngineCapasity;
import homeWorks.homeWork3_1.enums.ModelCar;
import homeWorks.homeWork3_1.enums.SizeWheel;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
    private final ModelCar modelCar;
    private CoralCar colorCar;
    private final EngineCapasity engineCapasity;
    private SizeWheel sizeWheel;
    private final Integer yearRelease;
    private Set<String> option;


    public Car(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
               SizeWheel sizeWheel, Integer yearRelease, Set<String> option) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.engineCapasity = engineCapasity;
        this.sizeWheel = sizeWheel;
        this.yearRelease = yearRelease;
        this.option = Objects.requireNonNullElseGet(option, () -> new HashSet<>(Set.of()));
    }


    @Override
    public String toString() {
        return "\n" + "Model: " + modelCar +
                ", Color: " + colorCar +
                ", Engine size: " + engineCapasity +
                ", Size Wheel: " + sizeWheel +
                ", Year release: " + yearRelease +
                ", options: " + option;
    }

    public CoralCar getColorCar() {
        return colorCar;
    }

    public void setColorCar(CoralCar colorCar) {
        this.colorCar = colorCar;
    }


    public SizeWheel getSizeWheel() {
        return sizeWheel;
    }

    public void setSizeWheel(SizeWheel sizeWheel) {
        this.sizeWheel = sizeWheel;
    }

    public Set<String> getOption() {
        return option;
    }

    public void setOption(Set<String> option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelCar == car.modelCar && engineCapasity == car.engineCapasity && yearRelease.equals(car.yearRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelCar, engineCapasity, yearRelease);
    }
}

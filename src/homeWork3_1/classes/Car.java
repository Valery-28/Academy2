package homeWork3_1.classes;

import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
    private final ModelCar modelCar;
    private CoralCar colorCar;
    private final EngineCapasity engineCapasity;
    private SizeWheel sizeWheel;
    private Set<String> options;

    public Car(ModelCar modelCar, CoralCar colorCar, EngineCapasity engineCapasity,
               SizeWheel sizeWheel, Set<String> options) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.engineCapasity = engineCapasity;
        this.sizeWheel = sizeWheel;
        this.options = options;
    }

    @Override
    public String toString() {
        return "\n" + "Model= " + modelCar +
                ", Color= " + colorCar +
                ", Engine size= " + engineCapasity +
                ", Size Wheel=" + sizeWheel +
                ", options=" + getOptions();
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

    public Set<String> getOptions() {
        if (options != null) {
            return options;
        } else {
            return new HashSet<>(Set.of());
        }
    }

    public void setOptions(Set<String> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelCar == car.modelCar && engineCapasity == car.engineCapasity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelCar, engineCapasity);
    }
}

package project.buyCar.car.parent;


import project.buyCar.additional_function.AdditionalFunction;
import project.buyCar.interfaces.ColorCar;
import project.buyCar.interfaces.EngineCapacityCar;
import project.buyCar.interfaces.ModelCar;
import project.buyCar.interfaces.SizeWheelCar;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class AbstractCar {

    private final ModelCar modelCar;
    private final ColorCar colorCar;
    private final EngineCapacityCar engineCapacityCar;
    private final SizeWheelCar sizeWheelCar;
    private final Integer yearRelease;
    private final Set<String> option;
    private final AdditionalFunction additionalFunction;


    public AbstractCar(ModelCar modelCar, ColorCar colorCar, EngineCapacityCar engineCapacityCar,
                       SizeWheelCar sizeWheelCar, Integer yearRelease,
                       Set<String> option, AdditionalFunction additionalFunction) {
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.engineCapacityCar = engineCapacityCar;
        this.sizeWheelCar = sizeWheelCar;
        this.yearRelease = yearRelease;
        this.option = Objects.requireNonNullElseGet(option, () -> new HashSet<>(Set.of()));
        this.additionalFunction = additionalFunction;
    }

    public AdditionalFunction getAdditionalFunction() {
        return additionalFunction;
    }

    @Override
    public String toString() {
        return
                ", Model: " + modelCar +
                        ", Color: " + colorCar +
                        ", Engine size: " + engineCapacityCar +
                        ", Size Wheel: " + sizeWheelCar +
                        ", Year release: " + yearRelease +
                        ", options: " + option +
                        ", additional function: " + getAdditionalFunction();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCar abstractCar = (AbstractCar) o;
        return modelCar == abstractCar.modelCar
                && engineCapacityCar == abstractCar.engineCapacityCar && yearRelease.equals(abstractCar.yearRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelCar, engineCapacityCar, yearRelease);
    }

}

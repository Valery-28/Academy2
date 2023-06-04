package homeWork3_1.classes;

import homeWork3_1.enums.CoralCar;
import homeWork3_1.enums.EngineCapasity;
import homeWork3_1.enums.ModelCar;
import homeWork3_1.enums.SizeWheel;

import java.util.ArrayList;

public class Car {
    private final ModelCar modelCar;
    private CoralCar colarCar;
    private final EngineCapasity engineCapasity;
    private SizeWheel sizeWheel;
    private final Integer yearRelease;
    private ArrayList<String> options = new ArrayList<>();

    public Car(ModelCar modelCar, CoralCar colarCar, EngineCapasity engineCapasity,
               SizeWheel sizeWheel, Integer yearRelease, ArrayList<String> options) {
        this.modelCar = modelCar;
        this.colarCar = colarCar;
        this.engineCapasity = engineCapasity;
        this.sizeWheel = sizeWheel;
        this.yearRelease = yearRelease;
        this.options = options;
    }

    @Override
    public String toString() {
        return "\n" + "Model= " + modelCar +
                ", Colar= " + colarCar +
                ", Engine size= " + engineCapasity +
                ", Size Wheel=" + sizeWheel +
                ", Year release= " + yearRelease +
                ", options=" + options;
    }

    public CoralCar getColarCar() {
        return colarCar;
    }

    public ServiceCar setColarCar(CoralCar colarCar) {
        this.colarCar = colarCar;
        return null;
    }

    public SizeWheel getSizeWheel() {
        return sizeWheel;
    }

    public ServiceCar setSizeWheel(SizeWheel sizeWheel) {
        this.sizeWheel = sizeWheel;
        return null;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public ServiceCar setOptions(ArrayList<String> options) {
        this.options = options;
        return null;
    }

    public ModelCar getModelCar() {
        return modelCar;
    }

    public EngineCapasity getEngineCapasity() {
        return engineCapasity;
    }

    public Integer getYearRelease() {
        return yearRelease;
    }

}

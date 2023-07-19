package project.buyCar.factoryCar.parent;


import project.buyCar.interfaces.CreateCar;

import java.util.Arrays;

import static java.lang.String.format;

public abstract class AbstractFactoryCar<MODEL, COLOR, ENGINE, SIZE, BRAND> implements CreateCar<BRAND> {

    private final MODEL[] allModelCar;
    private final COLOR[] allCoralCar;
    private final ENGINE[] allEngineCapacity;
    private final SIZE[] allSizeWheel;


    public AbstractFactoryCar(MODEL[] allModelCar, COLOR[] allCoralCar, ENGINE[] allEngineCapacity, SIZE[] allSizeWheel) {
        this.allModelCar = allModelCar;
        this.allCoralCar = allCoralCar;
        this.allEngineCapacity = allEngineCapacity;
        this.allSizeWheel = allSizeWheel;

    }

    public String getConfigurations() {
        return format(
                """
                        Factory can produce:
                        models: %s,
                        colors:  %s,
                        wheelSizes: %s,
                        engineVolumes: %s
                        """,
                Arrays.toString(allModelCar),
                Arrays.toString(allCoralCar),
                Arrays.toString(allEngineCapacity),
                Arrays.toString(allSizeWheel)
        );
    }
}


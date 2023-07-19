package project.buyCar.enums.enumBMW;

import project.buyCar.interfaces.EngineCapacityCar;

public enum EngineCapacityBMW implements EngineCapacityCar {
    MIN(1.6), STANDARD(2.0), BIG(2.5), MAX(4.0);

    EngineCapacityBMW(Double v) {
    }
}

package project.buyCar.enums.enumFord;

import project.buyCar.interfaces.EngineCapacityCar;

public enum EngineCapacityFord implements EngineCapacityCar {
    IN(1.6),STANDARD(2.0),BIG(2.5), MAX(3.0);

    EngineCapacityFord(Double v) {
    }
}

package project.buyCar.enums.enumAUDI;

import project.buyCar.interfaces.EngineCapacityCar;

public enum EngineCapacityAUDI implements EngineCapacityCar {
    MIN(1.6),BIG(3.0), MAX(5.0);

    EngineCapacityAUDI(Double v) {
    }
}

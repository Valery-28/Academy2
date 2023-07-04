package project.buyCar.enums.enumCar;

public enum Brand {
    AUDI(new CorolCar[]{CorolCar.BLACK,CorolCar.GREEN,CorolCar.WHITE},
            (new EngineCapacity[]{EngineCapacity.BIG,EngineCapacity.MAX}),
            (new SizeWheel[]{SizeWheel.R19,SizeWheel.R20})),
    BMW(new CorolCar[]{CorolCar.BLUE,CorolCar.WHITE, CorolCar.ORANGE},
            (new EngineCapacity[]{EngineCapacity.STANDARD, EngineCapacity.MAX}),
            (new SizeWheel[]{SizeWheel.R17,SizeWheel.R18})),
    FORD(new CorolCar[]{CorolCar.RED,CorolCar.PURPLE, CorolCar.YELOW},
            (new EngineCapacity[]{EngineCapacity.SMALL, EngineCapacity.MIN}),
            (new SizeWheel[]{SizeWheel.R16,SizeWheel.R15}));

    private final CorolCar[] colorCars;
    private final EngineCapacity[] engineCapacities;
    private  final SizeWheel[] sizeWheels;

    Brand(CorolCar[] corolCars, EngineCapacity[] engineCapacities, SizeWheel[] sizeWheels) {
        this.colorCars=corolCars;
        this.engineCapacities = engineCapacities;
        this.sizeWheels=sizeWheels;
    }

    public SizeWheel[] getSizeWheels() {
        return sizeWheels;
    }

    public CorolCar[] getColorCars() {
        return colorCars;
    }

    public EngineCapacity[] getEngineCapacities() {
        return engineCapacities;
    }

}

package project.test;

import project.buyCar.car.child.*;
import project.buyCar.enums.enumCar.*;
import project.buyCar.enums.enumModel.enumAudi.Drive;
import project.buyCar.enums.enumModel.enumAudi.ModelCarAUDI;
import project.buyCar.enums.enumModel.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumModel.enumFord.ModelCarFord;

public class Main {
    public static void main(String[] args) {
        CarAUDI carAUDI = new CarAUDI(ModelCarAUDI.A5,CorolCar.BLACK, EngineCapacity.BIG, SizeWheel.R19,
                2022, null, Drive.FULL_DRIVE);
        System.out.println(carAUDI);
        CarBMW carBMW = new CarBMW(ModelCarBMW.I8,CorolCar.BLUE, EngineCapacity.STANDARD, SizeWheel.R17,
                2022, null, 8000);
        System.out.println(carBMW);
        CarFord carFord = new CarFord(ModelCarFord.ESCALATE,CorolCar.RED,EngineCapacity.SMALL,SizeWheel.R16,
                2022,null,true);
        System.out.println(carFord);
    }
}

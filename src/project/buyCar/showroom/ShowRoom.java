package project.buyCar.showroom;


import project.buyCar.additional_function.AdditionalFunction;
import project.buyCar.car.child.CarAUDI;
import project.buyCar.car.child.CarBMW;
import project.buyCar.car.child.CarFord;
import project.buyCar.enums.enumAUDI.ColorCarAUDI;
import project.buyCar.enums.enumAUDI.EngineCapacityAUDI;
import project.buyCar.enums.enumAUDI.ModelCarAUDI;
import project.buyCar.enums.enumAUDI.SizeWheelAUDI;
import project.buyCar.enums.enumBMW.ColorCarBMW;
import project.buyCar.enums.enumBMW.EngineCapacityBMW;
import project.buyCar.enums.enumBMW.ModelCarBMW;
import project.buyCar.enums.enumBMW.SizeWheelBMW;
import project.buyCar.enums.enumFord.ColorCarFord;
import project.buyCar.enums.enumFord.EngineCapacityFord;
import project.buyCar.enums.enumFord.ModelCarFord;
import project.buyCar.enums.enumFord.SizeWheelFord;
import project.buyCar.factory_car.child.factory_audi.AUDIFactoryCar;
import project.buyCar.factory_car.child.factory_bmw.BMWFactoryCar;
import project.buyCar.factory_car.child.factory_ford.FordFactoryCar;
import project.buyCar.service.service_edit_colar.ServiceCarEditColor;
import project.buyCar.service.service_edit_option.ServiceCarEditOption;
import project.buyCar.service.service_edit_size_whell.ServiceCarEditSizeWheel;

import java.util.Set;

public class ShowRoom {
    private final AUDIFactoryCar audiFactoryCar;
    private final BMWFactoryCar bmwFactoryCar;
    private  final FordFactoryCar fordFactoryCar;
    private final ServiceCarEditColor serviceCarEditColor;
    private final ServiceCarEditSizeWheel serviceCarEditSizeWheel;
    private  final ServiceCarEditOption serviceCarEditOption;

    public ShowRoom(AUDIFactoryCar audiFactoryCar,BMWFactoryCar bmwFactoryCar,FordFactoryCar fordFactoryCar,
                    ServiceCarEditColor serviceCarEditColor,
                    ServiceCarEditSizeWheel serviceCarEditSizeWheel, ServiceCarEditOption serviceCarEditOption) {
        this.audiFactoryCar= audiFactoryCar;
        this.bmwFactoryCar= bmwFactoryCar;
        this.fordFactoryCar = fordFactoryCar;
        this.serviceCarEditColor = serviceCarEditColor;
        this.serviceCarEditSizeWheel = serviceCarEditSizeWheel;
        this.serviceCarEditOption = serviceCarEditOption;
    }

    public CarAUDI sellCar(ModelCarAUDI modelCar, ColorCarAUDI colorCar, EngineCapacityAUDI engineCapacityCar,
                           SizeWheelAUDI sizeWheelCar, Set<String>option, AdditionalFunction additionalFunction) {

        return audiFactoryCar.create(modelCar,colorCar,engineCapacityCar,sizeWheelCar,option, additionalFunction);
    }

    public CarBMW sellCar(ModelCarBMW modelCar, ColorCarBMW colorCar, EngineCapacityBMW engineCapacityCar,
                           SizeWheelBMW sizeWheelCar, Set<String>option, AdditionalFunction additionalFunction) {

        return bmwFactoryCar.create(modelCar,colorCar,engineCapacityCar,sizeWheelCar,option, additionalFunction);
    }

    public CarFord sellCar(ModelCarFord modelCar, ColorCarFord colorCar, EngineCapacityFord engineCapacityCar,
                           SizeWheelFord sizeWheelCar, Set<String>option, AdditionalFunction additionalFunction) {

        return fordFactoryCar.create(modelCar,colorCar,engineCapacityCar,sizeWheelCar,option, additionalFunction);
    }

    public void SalonEditColor(CarAUDI car, ColorCarAUDI colorCarAUDI) {
        serviceCarEditColor.editCarColor(car, colorCarAUDI);
    }
    public void SalonEditColor(CarBMW car, ColorCarBMW colorCarBMW) {
        serviceCarEditColor.editCarColor(car, colorCarBMW);
    }
    public void SalonEditColor(CarFord car, ColorCarFord colorCarFord) {
        serviceCarEditColor.editCarColor(car, colorCarFord);
    }

    public void SalonEditSizeWheel(CarAUDI car, SizeWheelAUDI sizeWheel) {
        serviceCarEditSizeWheel.changeWheel(car, sizeWheel);
    }
    public void SalonEditSizeWheel(CarBMW car, SizeWheelBMW sizeWheel) {
        serviceCarEditSizeWheel.changeWheel(car, sizeWheel);
    }
    public void SalonEditSizeWheel(CarFord car, SizeWheelFord sizeWheel) {
        serviceCarEditSizeWheel.changeWheel(car, sizeWheel);
    }
    public void SalonAddOption(CarAUDI car, String option) {
        serviceCarEditOption.addOption(car,option);
    }
    public void SalonAddOption(CarBMW car, String option) {
        serviceCarEditOption.addOption(car,option);
    }
    public void SalonAddOption(CarFord car, String option) {
        serviceCarEditOption.addOption(car,option);
    }
    public void SalonDeleteOption(CarAUDI car, String option) {
        serviceCarEditOption.deleteOption(car,option);
    }
    public void SalonDeleteOption(CarBMW car, String option) {
        serviceCarEditOption.deleteOption(car,option);
    }
    public void SalonDeleteOption(CarFord car, String option) {
        serviceCarEditOption.deleteOption(car, option);
    }
        public void SalonSetOptions(CarAUDI car, Set<String> option) {
        serviceCarEditOption.setOptions(car, option);
    }
    public void SalonSetOptions(CarBMW car, Set<String> option) {
        serviceCarEditOption.setOptions(car, option);
    }
    public void SalonSetOptions(CarFord car, Set<String> option) {
        serviceCarEditOption.setOptions(car, option);
    }
}

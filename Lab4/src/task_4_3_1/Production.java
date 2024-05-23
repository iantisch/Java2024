package task_4_3_1;

import task_4_3_1.builders.*;
import task_4_3_1.components.*;

public class Production {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Production(Builder builder) {
        this.builder = builder;
    }

    public Car buildCoupe(String color) {
        if (builder instanceof CarSetting)
            System.out.println("Sedan is building...");
        Car car = builder
                .setBodyType(BodyType.SEDAN)
                .setTransmission(new TransmissionOption()
                        .setNumberOfGears(6)
                        .setTransmissionType(TransmissionType.MANUAL)
                        .build()
                ).setEngine(new EngineOption()
                        .setFuelType(FuelType.DIESEL)
                        .setPower(150)
                        .setTorque(300)
                        .setVolume(2.0)
                        .build()
                ).setWheelDisk(new RimOption()
                        .setDiameter(16)
                        .setMaterialType(MaterialType.ALUMINIUM)
                        .setWidth(6)
                        .build()
                ).setRubber(new TyreOption()
                        .setRubberType(RubberType.SILICONE)
                        .setElasticity(0.5)
                        .setHardness(50)
                        .build()
                ).setColor(color)
                .build();
        if (builder instanceof CarSetting)
            System.out.println("Sedan is built!");
        return car;
    }

    public Car buildSUV(String color){
        if (builder instanceof CarSetting)
            System.out.println("SUV is building...");
        Car car = builder
                .setBodyType(BodyType.SUV)
                .setTransmission(new TransmissionOption()
                        .setNumberOfGears(6)
                        .setTransmissionType(TransmissionType.AUTOMATIC)
                        .build()
                ).setEngine(new EngineOption()
                        .setFuelType(FuelType.ELECTRIC)
                        .setPower(200)
                        .setTorque(400)
                        .setVolume(3.0)
                        .build()
                ).setWheelDisk(new RimOption()
                        .setDiameter(18)
                        .setMaterialType(MaterialType.ALUMINIUM)
                        .setWidth(8)
                        .build()
                ).setRubber(new TyreOption()
                        .setRubberType(RubberType.SYNTHETIC)
                        .setElasticity(0.5)
                        .setHardness(50)
                        .build()
                ).setColor(color)
                .build();
        if (builder instanceof CarSetting)
            System.out.println("SUV is built!");
        return car;
    }
}

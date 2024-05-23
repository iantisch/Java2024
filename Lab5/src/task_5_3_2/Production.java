package task_5_3_2;

import task_5_3_2.builders.*;
import task_5_3_2.components.*;

public class Production {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Production(Builder builder) {
        this.builder = builder;
    }

    public Car buildSedan(String color) {
        if (builder instanceof CarSetting)
            System.out.println("Wagon is building...");
        Car car = builder
                .setBodyType(BodyType.WAGON)
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
            System.out.println("Wagon is built!");
        return car;
    }

    public Car buildPickUp(String color){
        if (builder instanceof CarSetting)
            System.out.println("Hatchback is building...");
        Car car = builder
                .setBodyType(BodyType.HATCHBACK)
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
            System.out.println("Hatchback is built!");
        return car;
    }
}

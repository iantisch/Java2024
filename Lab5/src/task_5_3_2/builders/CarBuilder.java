package task_5_3_2.builders;

import task_5_3_2.Car;
import task_5_3_2.components.*;

public class CarBuilder implements Builder {
    private BodyType bodyType;
    private Rim wheelDisk;
    private Transmission transmission;
    private Tyre rubber;
    private Engine engine;
    private String color;

    @Override
    public Builder setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setWheelDisk(Rim wheelDisk) {
        this.wheelDisk = wheelDisk;
        return this;
    }

    @Override
    public Builder setRubber(Tyre rubber) {
        this.rubber = rubber;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(bodyType, wheelDisk, transmission, rubber, engine, color);
    }
}

package task_4_3_1.builders;

import task_4_3_1.components.Engine;
import task_4_3_1.components.FuelType;

public class EngineOption {
    private double power;
    private double volume;
    private double torque;
    private FuelType fuelType;

    public EngineOption setPower(double power) {
        this.power = power;
        return this;
    }

    public EngineOption setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public EngineOption setTorque(double torque) {
        this.torque = torque;
        return this;
    }

    public EngineOption setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Engine build() {
        return new Engine(power, volume, torque, fuelType);
    }
}

package task_5_3_2.builders;

import task_5_3_2.Car;
import task_5_3_2.components.*;

public interface Builder {
    Builder setBodyType(BodyType bodyType);
    Builder setTransmission(Transmission transmission);
    Builder setWheelDisk(Rim wheelDisk);
    Builder setRubber(Tyre rubber);
    Builder setEngine(Engine engine);
    Builder setColor(String color);
    Car build();
}

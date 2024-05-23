package task_4_3_1.builders;

import task_4_3_1.Car;
import task_4_3_1.components.*;

public interface Builder {
    Builder setBodyType(BodyType bodyType);
    Builder setTransmission(Transmission transmission);
    Builder setWheelDisk(Rim wheelDisk);
    Builder setRubber(Tyre rubber);
    Builder setEngine(Engine engine);
    Builder setColor(String color);
    Car build();
}

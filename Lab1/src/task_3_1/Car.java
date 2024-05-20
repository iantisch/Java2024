package task_3_1;

public class Car {
    private Engine engine;
    private Wheel wheel;

    Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }


    @Override
    public String toString() {
        return "Car{" +
                 engine +
                 wheel +
                '}';
    }
}




package task_3_1;

public class CarBuilder {

    public Car createCar(int enginePower, double engineSize, int max_Speed, String engineType, int rimSize, int tyreSize, String wheelType) {
        Engine engine = new Engine(enginePower, engineSize, max_Speed, engineType);
        Wheel wheel = new Wheel(rimSize, tyreSize, wheelType);

        return new Car(engine, wheel);
    }

    public void replaceCarEngine(Car car, int enginePower, double engineSize, int max_Speed,  String engineType) {
        Engine engine = new Engine(enginePower, engineSize, max_Speed, engineType);
        car.setEngine(engine);
    }

    public void replaceCarWheel(Car car, int rimSize, int tyreSize, String wheelType) {
        Wheel wheel = new Wheel(rimSize, tyreSize, wheelType);
        car.setWheel(wheel);
    }

    public void updateCar(Car car, int enginePower, double engineSize, int max_Speed, String engineType, int rimSize, int tyreSize, String wheelType) {
        replaceCarEngine(car, enginePower, engineSize, max_Speed, engineType);
        replaceCarWheel(car, rimSize, tyreSize, wheelType);
    }
}

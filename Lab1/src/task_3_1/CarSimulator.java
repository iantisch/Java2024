package task_3_1;

public class CarSimulator {

    private final CarBuilder carBuilder;
    private final Car car;

    CarSimulator(int enginePower, double engineSize, int max_Speed, String engineType, int rimSize, int tyreSize, String wheelType) {
        this.carBuilder = new CarBuilder();
        this.car = carBuilder.createCar(enginePower, engineSize, max_Speed, engineType, rimSize, tyreSize, wheelType);
    }

    public void updateCar(int enginePower, double engineSize, int max_Speed, String engineType, int rimSize, int tyreSize, String wheelType) {
        carBuilder.updateCar(car, enginePower, engineSize, max_Speed, engineType, rimSize, tyreSize, wheelType);
        System.out.println("New car: " + car);
    }

    public void simulateDragRace(int distance ) {
        int time = distance / car.getEngine().getMaxSpeed();
        System.out.println("Drad time: " + time);
    }

    public Car getCar() {
        return car;
    }
}

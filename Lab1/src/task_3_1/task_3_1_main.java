package task_3_1;

public class task_3_1_main {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator(100, 2.5, 150, "gas", 20, 50, "summer");
        System.out.println("Car: " + carSimulator.getCar());
        carSimulator.simulateDragRace(1600);
        carSimulator.updateCar(200,3, 220, "diesel", 18, 60, "winter");
        carSimulator.simulateDragRace(1600);
    }
}

package task_3_1;

public class Engine {
    private final int power;
    private final double size;
    private final int maxSpeed;
    private final String type;

    Engine(int power, double size, int maxSpeed, String type) {
        this.power = power;
        this.size = size;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    @Override
    public String toString() {
        return " Engine{" +
                "power=" + power +
                ", size=" + size +
                ", maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                '}';
    }
}

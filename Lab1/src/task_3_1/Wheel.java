package task_3_1;

public class Wheel {
    private final int rim_size;
    private final int tyre_size;
    private final String type;

    Wheel(int rim_size, int tyre_size, String type) {
        this.rim_size = rim_size;
        this.tyre_size = tyre_size;
        this.type = type;
    }


    @Override
    public String toString() {
        return ", Wheel{" +
                "Rim =" + rim_size +
                ", Tyre =" + tyre_size +
                ", type='" + type + '\'' +
                '}';
    }
}

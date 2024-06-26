package task_4_3_1.components;

public class Rim {
    private final double diameter;
    private final double width;
    private final MaterialType materialType;

    public Rim(double diameter, double width, MaterialType materialType) {
        this.diameter = diameter;
        this.width = width;
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return "WheelDisk{" +
                "diameter=" + diameter +
                ", width=" + width +
                ", materialType=" + materialType +
                '}';
    }
}

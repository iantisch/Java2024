package task_5_3_2.components;

public class Rim implements Cloneable {
    private final double diameter;
    private final double width;
    private final MaterialType materialType;

    public Rim(double diameter, double width, MaterialType materialType) {
        this.diameter = diameter;
        this.width = width;
        this.materialType = materialType;
    }

    public Rim(Rim other) {
        this(other.diameter, other.width, other.materialType);
    }

    @Override
    public String toString() {
        return "WheelDisk{" +
                "diameter=" + diameter +
                ", width=" + width +
                ", materialType=" + materialType +
                '}';
    }

    @Override
    public Rim clone() {
        return new Rim(this);
    }
}

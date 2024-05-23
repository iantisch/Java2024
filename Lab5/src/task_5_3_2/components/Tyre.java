package task_5_3_2.components;

public class Tyre implements Cloneable {
    private final RubberType rubberType;
    private final double hardness;
    private final double elasticity;

    public Tyre(RubberType rubberType, double hardness, double elasticity) {
        this.rubberType = rubberType;
        this.hardness = hardness;
        this.elasticity = elasticity;
    }

    public Tyre(Tyre other) {
        this(other.rubberType, other.hardness, other.elasticity);
    }

    @Override
    public String toString() {
        return "Rubber{" +
                "rubberType=" + rubberType +
                ", hardness=" + hardness +
                ", elasticity=" + elasticity +
                '}';
    }

    @Override
    public Tyre clone() {
        return new Tyre(this);
    }
}

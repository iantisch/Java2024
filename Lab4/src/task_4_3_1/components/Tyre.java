package task_4_3_1.components;

public class Tyre {
    private final RubberType rubberType;
    private final double hardness;
    private final double elasticity;

    public Tyre(RubberType rubberType, double hardness, double elasticity) {
        this.rubberType = rubberType;
        this.hardness = hardness;
        this.elasticity = elasticity;
    }

    @Override
    public String toString() {
        return "Rubber{" +
                "rubberType=" + rubberType +
                ", hardness=" + hardness +
                ", elasticity=" + elasticity +
                '}';
    }
}

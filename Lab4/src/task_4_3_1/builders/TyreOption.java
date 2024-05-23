package task_4_3_1.builders;

import task_4_3_1.components.Tyre;
import task_4_3_1.components.RubberType;

public class TyreOption {
    private RubberType rubberType;
    private double hardness;
    private double elasticity;

    public TyreOption setRubberType(RubberType rubberType) {
        this.rubberType = rubberType;
        return this;
    }

    public TyreOption setHardness(double hardness) {
        this.hardness = hardness;
        return this;
    }

    public TyreOption setElasticity(double elasticity) {
        this.elasticity = elasticity;
        return this;
    }

    public Tyre build() {
        return new Tyre(rubberType, hardness, elasticity);
    }
}

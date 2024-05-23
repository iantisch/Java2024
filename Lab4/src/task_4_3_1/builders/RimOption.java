package task_4_3_1.builders;

import task_4_3_1.components.MaterialType;
import task_4_3_1.components.Rim;

public class RimOption {
    private double diameter;
    private double width;
    private MaterialType materialType;

    public RimOption setDiameter(double diameter) {
        this.diameter = diameter;
        return this;
    }

    public RimOption setWidth(double width) {
        this.width = width;
        return this;
    }

    public RimOption setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
        return this;
    }

    public Rim build() {
        return new Rim(diameter, width, materialType);
    }
}

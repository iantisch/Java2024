package task_5_3_2.builders;

import task_5_3_2.components.*;

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

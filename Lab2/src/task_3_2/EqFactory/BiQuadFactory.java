package task_3_2.EqFactory;

import task_3_2.Equations.BiQuadraticEquation;
import task_3_2.Equations.IEquation;

public class BiQuadFactory extends EqFactory {
    public BiQuadFactory(boolean detailedOutput) {
        this.detailedOutput = detailedOutput;
    }

    @Override
    public IEquation createEquation(String[] coefficients) {
        if (coefficients.length != 5) {
            throw new IllegalArgumentException("wrong number of coefficients");
        }
        if (detailedOutput)
            System.out.println("Creating BiQuadraticEquation: " + coefficients[0] + "x^4 + "
                    + coefficients[2] + "x^2 + " + coefficients[4] + " = 0");
        return new BiQuadraticEquation(coefficients[0], coefficients[2], coefficients[4]);
    }
}
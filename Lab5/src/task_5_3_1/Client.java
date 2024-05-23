package task_5_3_1;

import task_5_3_1.Equations.*;

public class Client {

    public static void main(String[] args) {
        IEquation[] equations = new IEquation[3*2];

        equations[0] = new Equation("2", "3");
        equations[1] = new QuadraticEquation("1", "2", "3");
        equations[2] = new BiQuadraticEquation("4", "5", "6");

        for (int i = 3 ; i < 6 ; i++) {
            equations[i] = equations[i-3].clone();
        }

        for (IEquation equation : equations) {
            System.out.println(equation);
        }
    }
}

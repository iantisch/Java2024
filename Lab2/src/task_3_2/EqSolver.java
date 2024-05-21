package task_3_2;

import task_3_2.EqFactory.BiQuadFactory;
import task_3_2.EqFactory.LinearFactory;
import task_3_2.EqFactory.QuadFactory;
import task_3_2.Equations.IEquation;

import java.io.BufferedReader;
import java.io.FileReader;



//
//   IF YOU WANT TO SEE THE WHOLE OUTPUT (NOT ONLY GREATEST AND SMALLEST ROOT, PLEASE CHANGE detailedOutput = True
//



public class EqSolver {

    public static double getGreatestRoot(double[] roots) {
        double greatestRoot = Double.MIN_VALUE;
        for (double root : roots) {
            if (root > greatestRoot) {
                greatestRoot = root;
            }
        }
        return greatestRoot;
    }

    public static double getSmallestRoot(double[] roots) {
        double smallestRoot = Double.MAX_VALUE;
        for (double root : roots) {
            if (root < smallestRoot) {
                smallestRoot = root;
            }
        }
        return smallestRoot;
    }

    public static void getNumberOfSolutions(double[] roots) {
        if (roots.length == 1) {
            System.out.println("One solution: " + roots[0]);
        } else if (roots.length == 2) {
            System.out.println("Two solutions: " + roots[0] + " " + roots[1]);
        } else if (roots.length == 3) {
            System.out.println("Three solutions: " + roots[0] + " " + roots[1] + " " + roots[2]);
        } else if (roots.length == 4) {
            System.out.println("Four solutions: " + roots[0] + " " + roots[1] + " " + roots[2] + " " + roots[3]);
        } else {
            throw new IllegalArgumentException("Wrong number of roots");
        }
    }

    public static void main(String[] args) {

        boolean detailedOutput = false;           //     CHANGE HERE ========================================

        LinearFactory linearEqFactory = new LinearFactory(detailedOutput);
        QuadFactory quadraticEqFactory = new QuadFactory(detailedOutput);
        BiQuadFactory biQuadraticEqFactory = new BiQuadFactory(detailedOutput);

        for (int i = 0; i < 3; i++) {
            double greatestRoot = Double.MIN_VALUE;
            double smallestRoot = Double.MAX_VALUE;
            IEquation equationWithGreatestRoot = null;
            IEquation equationWithSmallestRoot = null;

            System.out.println("--------------------" + "Input0" + (i + 1) + ".txt" + "--------------------");
            try (FileReader fileReader = new FileReader("Lab2/src/task_3_2/TargetFiles/input0" + (i + 1) + ".txt")) {
                BufferedReader buffer = new BufferedReader(fileReader);
                String line;

                while ((line = buffer.readLine()) != null) {
                    String[] coefficients = line.trim().split("\\s+");
                    if (coefficients.length == 1 && coefficients[0].equals("")){
                        if (detailedOutput)
                            System.out.println("Skipping empty line");
                        continue;
                    }
                    try {
                        IEquation equation;
                        switch (coefficients.length) {
                            case 2 -> equation = linearEqFactory.createEquation(coefficients);
                            case 3 -> equation = quadraticEqFactory.createEquation(coefficients);
                            case 5 -> equation = biQuadraticEqFactory.createEquation(coefficients);
                            default -> throw new IllegalArgumentException("Wrong number of coefficients: " +
                                    coefficients.length + " in line: " + String.join(" ", coefficients));
                        }

                        assert equation != null;

                        double[] roots = equation.solve();

                        if (roots.length == 1){
                            double greatestRootInEquation = getGreatestRoot(roots);
                            double smallestRootInEquation = getSmallestRoot(roots);
                            if (greatestRootInEquation > greatestRoot) {
                                greatestRoot = greatestRootInEquation;
                                equationWithGreatestRoot = equation;
                            }
                            if (smallestRootInEquation < smallestRoot) {
                                smallestRoot = smallestRootInEquation;
                                equationWithSmallestRoot = equation;
                            }
                        }

                        if (detailedOutput){
                            getNumberOfSolutions(roots);
                            System.out.println();
                        }
                    } catch (ArithmeticException e) {
                        if (detailedOutput)
                            System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n");
            System.out.println("Equation with greatest root:\n " + equationWithGreatestRoot + ", x = " + greatestRoot);
            System.out.println("Equation with smallest root:\n " + equationWithSmallestRoot + ", x = " + smallestRoot);
            System.out.println("==============================================================================================================================================\n\n\n\n\n");
        }
    }
}

package by.bsuir.lab1.tasks;

import java.util.ArrayList;

public class Task3 {
    private static final double EPSILON = 0.001;

    private double[] makeArray(double x, double y) {
        double[] temp = new double[2];
        temp[0] = x;
        temp[1] = y;
        return temp;
    }

    private double tangentCalculation(double a){

        double tail = Math.abs(a / Math.PI);
        tail -= Math.floor(tail);

        if ((a > Math.PI) && (tail <= EPSILON) || (Math.abs(a - Math.PI) <= EPSILON)) {
            return 0;
        } else if ((a > Math.PI / 2) && (tail <= EPSILON + 0.5) || (Math.abs(a - Math.PI / 2) <= EPSILON)) {
            return Double.POSITIVE_INFINITY;
        } else {
            return Math.tan(a);
        }
    }

    public ArrayList<double[]> Tangent(double a, double b, double h) {

        ArrayList<double[]> result = new ArrayList<>();

        result.add(makeArray(a, tangentCalculation(a)));
        if (Math.abs(a - b) > EPSILON) {
            if (((b > a) && (h < 0)) || ((b < a) && (h > 0))
                    || (Math.abs(a - b) - Math.abs(h) <= EPSILON)) {
                result.add(makeArray(b, tangentCalculation(b)));
            } else {
                while (((h < 0) && (a > b)) || ((h > 0) && (a < b))) {
                    a += h;
                    result.add(makeArray(a, tangentCalculation(a)));
                }
                if (Math.abs(a - b) >= EPSILON) {
                    result.add(makeArray(b, tangentCalculation(b)));
                }
            }
        }
        return result;
    }
}

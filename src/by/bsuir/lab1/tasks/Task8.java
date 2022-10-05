package by.bsuir.lab1.tasks;

import java.util.Arrays;

public class Task8 {

    private double[][] result;
    private int currA;
    private final double A_POSITION = -1;

    private void setValues(int index, double value0, double value1) {
        result[0][index] = value0;
        result[1][index] = value1;

        if (value1 == A_POSITION) {
            currA++;
        }
    }

    public double[][] getNonDecreasingSequence(double[] arrayA, double[] arrayB) {
        result = new double[2][arrayA.length + arrayB.length];
        currA = 0;

        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] <= arrayA[0]) {
                setValues(i, arrayB[i], currA);
            } else {
                if (currA == 0) {
                    setValues(i + currA, arrayA[currA], A_POSITION);
                }
                if (arrayB[i] > arrayA[arrayA.length - 1]) {
                    System.arraycopy(arrayA, currA, result[0], currA + i, arrayA.length - currA);
                    Arrays.fill(result[1], currA + i, arrayA.length + i, -1);
                    currA = arrayA.length;
                    setValues(i + currA, arrayB[i], currA);
                } else {
                    while (!((arrayB[i] > arrayA[currA - 1]) && (arrayB[i] <= arrayA[currA]))) {
                        setValues(i + currA, arrayA[currA], A_POSITION);
                    }
                    setValues(i + currA, arrayB[i], currA);
                }
            }
        }

        if (currA != arrayA.length) {
            System.arraycopy(arrayA, currA, result[0], currA + arrayB.length, arrayA.length - currA);
            Arrays.fill(result[1], currA + arrayB.length, result[1].length, -1);
        }

        return result;
    }
}

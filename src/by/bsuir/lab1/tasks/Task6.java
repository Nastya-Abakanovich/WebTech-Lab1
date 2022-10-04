package by.bsuir.lab1.tasks;

public class Task6 {

    public double[][] getMatrix(double[] values) {
        int length = values.length;
        double[][] matrix = new double[length][length];

        System.arraycopy(values, 0, matrix[0], 0, length);
        for (int i = 1; i < length; i++) {
            System.arraycopy(matrix[i - 1], 1, matrix[i], 0, length - 1);
            matrix[i][length - 1] = matrix[i - 1][0];
        }
        return matrix;
    }
}

package by.bsuir.lab1;
import by.bsuir.lab1.tasks.Task1;
import by.bsuir.lab1.tasks.Task2;
import by.bsuir.lab1.tasks.Task3;
import by.bsuir.lab1.tasks.Task4;
import by.bsuir.lab1.tasks.Task5;
import by.bsuir.lab1.tasks.Task6;
import by.bsuir.lab1.tasks.Task7;
import by.bsuir.lab1.tasks.Task8;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        outputTask1();
        outputTask2();
        outputTask3();
        outputTask4();
        outputTask5();
        outputTask6();
        outputTask7();
        outputTask8();
    }

    public static void outputTask1(){
        double [][] arr = {{0.5, 0.5}, {1, 1}, {10, 12.1}, {5.5, 5.5}, {0, 0}, {200.7, 100.5}};
        Task1 task1 = new Task1();

        System.out.println("\nTASK 1");
        for(double[] point : arr) {
            System.out.format("x = %.1f y = %.1f f(x,y) = %.3f\n", point[0], point[1],
                    task1.valueCalculation(point[0], point[1]));
        }
    }

    public static void outputTask2(){
        int [][] points = {{1, 2}, {-2, 5}, {-1, 0}, {-6, -3}, {5, 0}, {6, 2}, {10, 10}};
        Task2 task2 = new Task2();

        System.out.println("\nTASK 2");
        for(int[] point : points) {
            System.out.format("(%d, %d) - %s\n", point[0], point[1],
                    task2.isBelongArea(point[0], point[1]));
        }
    }

    public static void outputTask3(){

        double [][] arr = {{0, 3 * Math.PI, Math.PI / 2}, {1, 1, 3}, {1.1, 2.3, 0.1}, {1.1, 2.3, -0.1},
                          {-1.1, -2.3, 0.1}, {-1.1, -2.3, -0.1}, {1.1, 2.35, 0.1}};
        Task3 task3 = new Task3();
        ArrayList<double[]> results;

        System.out.println("\nTASK 3");
        for(double[] data : arr) {
            System.out.format("\na = %.3f b = %.3f h = %.3f\n", data[0], data[1], data[2]);
            System.out.format("------------------------------------\n");
            System.out.format("|       arg     |       tg(arg)    |\n");
            System.out.format("------------------------------------\n");

            results = task3.Tangent(data[0], data[1], data[2]);
            for (double[] result : results) {
                String str = (result[1] == Double.POSITIVE_INFINITY) ? "   Don't exists   |" : String.format("   %10.5f     |", result[1]);
                System.out.format("| %10.5f    |" + str + "\n", result[0]);
            }
            System.out.format("------------------------------------\n");
        }
    }

    private static String arrayToString(int[] arr, boolean isPrimeArray) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while ((!isPrimeArray && i < arr.length) || (isPrimeArray && arr[i] != -1)) {
            result.append(String.format("%d ", arr[i]));
            i++;
        }
        return result.toString();
    }

    private static String arrayToString(double[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(String.format("%4.1f ", arr[i]));
        }
        return result.toString();
    }

    private static String arrayToStringWithoutNegative(double[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                result.append(String.format("%2.0f ", arr[i]));
            }
        }
        return result.toString();
    }

    public static void outputTask4(){
        Task4 task4 = new Task4();
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {7, 5, 13, 19, 199, 5011, 8377};
        int[] arr3 = {2, 12, 15, 35, 100, 1500};
        int[] temp;

        System.out.println("\nTASK 4");
        System.out.format("Source array 1: %s\n", arrayToString(arr1, false));
        temp = task4.searchPrimeNumbers(arr1);
        System.out.format("Position of primes: %s\n\n", temp[0] != -1? arrayToString(temp, true):
                                                                        "there are no prime numbers in the array");
        System.out.format("Source array 2: %s\n", arrayToString(arr2, false));
        temp = task4.searchPrimeNumbers(arr2);
        System.out.format("Position of primes: %s\n\n", temp[0] != -1? arrayToString(temp, true):
                                                                        "there are no prime numbers in the array");
        System.out.format("Source array 3: %s\n", arrayToString(arr3, false));
        temp = task4.searchPrimeNumbers(arr3);
        System.out.format("Position of primes: %s\n\n", temp[0] != -1? arrayToString(temp, true):
                                                                        "there are no prime numbers in the array");
    }

    public static void outputTask5(){
        Task5 task5 = new Task5();
        // Remove 4 numbers. For example 10, 12, 3, 2 or 6, 3, 7, 8
        int[] arr1 = {5, 10, 6, 12, 3, 24, 7, 8};
        // Remove 6 numbers.
        int[] arr2 = {20, 12, 9, 8, 5, 3, 1};
        // Remove 0 numbers.
        int[] arr3 = {2, 12, 15, 35, 100, 1500};

        System.out.println("\nTASK 5");
        System.out.format("Source array 1: %s\n", arrayToString(arr1, false));
        System.out.format("Remove %d numbers.\n\n", task5.search(arr1));
        System.out.format("Source array 2: %s\n", arrayToString(arr2, false));
        System.out.format("Remove %d numbers.\n\n", task5.search(arr2));
        System.out.format("Source array 3: %s\n", arrayToString(arr3, false));
        System.out.format("Remove %d numbers.\n", task5.search(arr3));

    }

    private static String matrixToString(double[][] matrix) {
        int lengthX = matrix[0].length;
        int lengthY = matrix.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lengthY; i++) {
            for (int j = 0; j < lengthX; j++) {
                result.append(String.format("%4.1f ", matrix[i][j]));
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void outputTask6(){
        Task6 task6 = new Task6();
        double[] arr = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8};

        System.out.println("\nTASK 6");
        System.out.format("Source array: %s\n", arrayToString(arr));
        System.out.format("Matrix:\n%s", matrixToString(task6.getMatrix(arr)));
    }

    public static void outputTask7(){
        Task7 task7 = new Task7();
        double[] arr = {0.1, 0.3, 0.9, 0.4, 0.5, 0.8, 0.2, 0.7, 0.6};

        System.out.println("\nTASK 7");
        System.out.format("Source array: %s\n", arrayToString(arr));
        System.out.format("Sorting array: %s\n", arrayToString(task7.shellSorting(arr)));


    }

    public static void outputTask8(){
        Task8 task8 = new Task8();
        double[] arrA1 = {0.1, 0.2, 0.3, 0.4};
        double[] arrB1 = {0.5, 0.6, 0.7, 0.8, 0.9, 1};
        double[] arrA2 = {0.5, 0.6, 0.7};
        double[] arrB2 = {0.1, 0.2, 0.3, 0.4};
        double[] arrA3 = {0.1, 0.2, 0.3, 0.4, 0.7};
        double[] arrB3 = {0.2, 0.2, 0.5, 0.6, 0.8};
        double[][] result;

        System.out.println("\nTASK 8");
        System.out.format("Source array A1: %s\n", arrayToString(arrA1));
        System.out.format("Source array B1: %s\n", arrayToString(arrB1));
        result = task8.getNonDecreasingSequence(arrA1, arrB1);
        System.out.format("Resulting array1: %s\n", arrayToString(result[0]));
        System.out.format("Insertion position: %s\n\n", arrayToStringWithoutNegative(result[1]));

        System.out.format("Source array A2: %s\n", arrayToString(arrA2));
        System.out.format("Source array B2: %s\n", arrayToString(arrB2));
        result = task8.getNonDecreasingSequence(arrA2, arrB2);
        System.out.format("Resulting array2: %s\n", arrayToString(result[0]));
        System.out.format("Insertion position: %s\n\n", arrayToStringWithoutNegative(result[1]));

        System.out.format("Source array A3: %s\n", arrayToString(arrA3));
        System.out.format("Source array B3: %s\n", arrayToString(arrB3));
        result = task8.getNonDecreasingSequence(arrA3, arrB3);
        System.out.format("Resulting array3: %s\n", arrayToString(result[0]));
        System.out.format("Insertion position: %s\n", arrayToStringWithoutNegative(result[1]));
    }
}

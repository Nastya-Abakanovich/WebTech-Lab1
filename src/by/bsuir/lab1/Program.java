package by.bsuir.lab1;
import by.bsuir.lab1.tasks.Task1;
import by.bsuir.lab1.tasks.Task2;
import by.bsuir.lab1.tasks.Task3;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        outputTask1();
        outputTask2();
        outputTask3();
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
}

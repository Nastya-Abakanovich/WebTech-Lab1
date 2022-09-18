package by.bsuir.lab1;
import by.bsuir.lab1.task1.ExpressionValue;
import by.bsuir.lab1.task2.Area;

public class Program {

    public static void main(String[] args) {
        Task1();
        Task2();
    }

    public static void Task1(){
        double [][] arr = {{0.5, 0.5}, {1, 1}, {10, 12.1}, {5.5, 5.5}, {0, 0}, {200.7, 100.5}};

        System.out.println("\nTASK 1");
        for(double[] point : arr) {
            System.out.format("x = %.1f y = %.1f f(x,y) = %.3f\n", point[0], point[1],
                              ExpressionValue.ValueCalculation(point[0], point[1]));
        }
    }

    public static void Task2(){
        int [][] points = {{1, 2}, {-2, 5}, {-1, 0}, {-6, -3}, {5, 0}, {6, 2}, {10, 10}};

        System.out.println("\nTASK 2");
        for(int[] point : points) {
            System.out.format("(%d, %d) - %s\n", point[0], point[1],
                              Area.IsBelongArea(point[0], point[1]));
        }
    }
}

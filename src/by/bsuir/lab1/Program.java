package by.bsuir.lab1;
import by.bsuir.lab1.task1.ExpressionValue;

public class Program {

    public static void main(String[] args) {
        Task1();
    }

    public static void Task1(){
        double [][] arr = {{0.5, 0.5}, {1, 1}, {10, 12.1}, {5.5, 5.5}, {0, 0}, {200.7, 100.5}};

        System.out.println("\nTASK 1");
        for(int i = 0; i < arr.length; i++) {
            System.out.format("x = %.1f y = %.1f f(x,y) = %.3f\n", arr[i][0], arr[i][1],
                              ExpressionValue.ValueCalculation(arr[i][0], arr[i][1]));
        }
    }
}

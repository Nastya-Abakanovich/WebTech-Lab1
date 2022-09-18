package by.bsuir.lab1.task1;

public class ExpressionValue {

    public static double ValueCalculation(double x, double y){
        double numerator, denominator;
        numerator = 1 + Math.pow(Math.sin(x + y), 2);
        denominator = 2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y)));
        return (numerator / denominator) + x;
    }
}

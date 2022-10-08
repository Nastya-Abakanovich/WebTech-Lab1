package by.bsuir.lab1;
/*import by.bsuir.lab1.tasks.Task1;
import by.bsuir.lab1.tasks.Task2;
import by.bsuir.lab1.tasks.Task3;
import by.bsuir.lab1.tasks.Task4;
import by.bsuir.lab1.tasks.Task5;
import by.bsuir.lab1.tasks.Task6;
import by.bsuir.lab1.tasks.Task7;
import by.bsuir.lab1.tasks.Task8;*/
import by.bsuir.lab1.tasks.task9.*;
import by.bsuir.lab1.tasks.task12.Book;
import by.bsuir.lab1.tasks.task13.ProgrammerBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        /*outputTask1();
        outputTask2();
        outputTask3();
        outputTask4();
        outputTask5();
        outputTask6();
        outputTask7();
        outputTask8();*/
        outputTask9();
        outputTask12();
        outputTask13();
        outputTask14_1();
        outputTask14_2();
    }

   /* public static void outputTask1(){
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
*/
    public static void outputTask9(){
        Basket basket = new Basket();
        // Sum = 107.1, blue balls number = 3
        Ball[] balls = {new Ball(10.5, Colors.BLACK),
                        new Ball(20.0, Colors.BLUE),
                        new Ball(18.5, Colors.PINK),
                        new Ball(12.3, Colors.BLUE),
                        new Ball(5.7, Colors.BLACK),
                        new Ball(6.2, Colors.RED),
                        new Ball(11.8, Colors.WHITE),
                        new Ball(22.1, Colors.BLUE),
        };

        System.out.println("\nTASK 9");
        for (Ball ball: balls) {
            basket.catchBall(ball);
        }
        System.out.format("Total weight: %5.1f\n", basket.getTotalWeight());
        System.out.format("Blue balls number: %d\n", basket.getBlueBallsNumber());
    }

    public static void outputTask12(){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book("The best book", "The best author", 15);

        System.out.println("\nTASK 12");
        System.out.format("Book 1:\n%s\n", book1);
        System.out.format("hash code: %d\n", book1.hashCode());
        System.out.format("Book 2:\n%s\n", book2);
        System.out.format("hash code: %d\n", book2.hashCode());
        System.out.format("Book 3:\n%s\n", book3);
        System.out.format("hash code: %d\n", book3.hashCode());
        if (book1.equals(book2)) {
            System.out.format("Book 1 is equal book 2\n");
        } else {
            System.out.format("Book 1 is not equal book 2\n");
        }

        if (book1.equals(book3)) {
            System.out.format("Book 1 is equal book 3\n");
        } else {
            System.out.format("Book 1 is not equal book 3\n");
        }

        if (book2.equals(book3)) {
            System.out.format("Book 2 is equal book 3\n");
        } else {
            System.out.format("Book 2 is not equal book 3\n");
        }

    }

    public static void outputTask13(){
        ProgrammerBook book1 = new ProgrammerBook();
        ProgrammerBook book2 = new ProgrammerBook();
        ProgrammerBook book3 = new ProgrammerBook("The best book", "The best author", 15, "C#", 2);

        System.out.println("\nTASK 13");
        System.out.format("Book 1:\n%s\n", book1);
        System.out.format("hash code: %d\n", book1.hashCode());
        System.out.format("Book 2:\n%s\n", book2);
        System.out.format("hash code: %d\n", book2.hashCode());
        System.out.format("Book 3:\n%s\n", book3);
        System.out.format("hash code: %d\n", book3.hashCode());
        if (book1.equals(book2)) {
            System.out.format("Book 1 is equal book 2\n");
        } else {
            System.out.format("Book 1 is not equal book 2\n");
        }

        if (book1.equals(book3)) {
            System.out.format("Book 1 is equal book 3\n");
        } else {
            System.out.format("Book 1 is not equal book 3\n");
        }

        if (book2.equals(book3)) {
            System.out.format("Book 2 is equal book 3\n");
        } else {
            System.out.format("Book 2 is not equal book 3\n");
        }

    }

    public static void outputTask14_1(){
        Book book = new Book("The best book", "The best author", 15);
        Book cloneBook = (Book) book.clone();

        System.out.println("\nTASK 14_1");
        System.out.format("Book:\n%s\n", book);
        System.out.format("Clone book:\n%s\n", cloneBook.toString());
        if (book.equals(cloneBook)) {
            System.out.format("Book is equal clone book\n");
        } else {
            System.out.format("Book is not equal clone book\n");
        }

    }

    public static void outputTask14_2(){
        List<Book> library = new ArrayList<>();
        library.add(new Book("Book4", "Author", 15, "978-2-266-12160-0")); //4
        library.add(new Book("Book2", "Author", 15, "978-2-266-11160-1")); //2
        library.add(new Book("Book1", "Author", 15, "978-2-266-11160-0")); //1
        library.add(new Book("Book3", "Author", 15, "978-2-266-11161-0")); //3

        System.out.println("\nTASK 14_2");
        System.out.println("Before sorting:");
        library.forEach(System.out::println);
        Collections.sort(library);
        System.out.println("\nAfter sorting:");
        library.forEach(System.out::println);
    }

}

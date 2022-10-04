package by.bsuir.lab1.tasks;

public class Task7 {

    public double[] shellSorting(double[] arr) {
        int currPos = 0;
        double temp;

        while (currPos != arr.length - 1) {
            if (arr[currPos] <= arr[currPos + 1]) {
                currPos++;
            } else {
                temp = arr[currPos];
                arr[currPos] = arr[currPos + 1];
                arr[currPos + 1] = temp;
                currPos--;
            }
        }
        return arr;
    }
}

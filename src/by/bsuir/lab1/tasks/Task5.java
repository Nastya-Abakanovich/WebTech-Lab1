package by.bsuir.lab1.tasks;

public class Task5 {

    private int searchMax(int[] numbers)
    {
        int maxPos = 0;

        for (int currPos = 0; currPos < numbers.length; currPos++) {
            if (numbers[maxPos] < numbers[currPos]) {
                maxPos = currPos;
            }
        }
        return numbers[maxPos];
    }

    public int search(int[] numbers) {
        int length = numbers.length;
        int[] counts = new int[length];

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if ((numbers[i] > numbers[j]) && (counts[i] <= counts[j])) {
                    counts[i] = counts[j] + 1;
                }
            }
        }
        return length - 1 - searchMax(counts);
    }
}

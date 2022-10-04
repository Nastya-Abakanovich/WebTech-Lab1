package by.bsuir.lab1.tasks;

public class Task4 {
    private boolean isPrimeNumber(double number) {
        int sqrtNumber = (int) Math.ceil(Math.sqrt(number));
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0)  {
                return false;
            }
        }
        return true;
    }

    public int[] searchPrimeNumbers(int[] arrayNumbers) {
        int[] arrayPrimeNumbers = new int[arrayNumbers.length + 1];
        int j = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (isPrimeNumber(arrayNumbers[i])) {
                arrayPrimeNumbers[j] = i;
                j++;
            }
        }
        arrayPrimeNumbers[j] = -1;
        return arrayPrimeNumbers;
    }
}

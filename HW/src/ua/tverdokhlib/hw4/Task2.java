package ua.tverdokhlib.hw4;

import java.util.concurrent.ThreadLocalRandom;
//Заполнить одномерный массив случайными целочисленными значениями.
//• Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        generateRandomArray(array);
        System.out.println("Original array:");
        printArray(array);
        int primeCount = countOfPrimes(array);
        System.out.println("The count of primes in the array is: " + primeCount);
    }

    private static int[] generateRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    private static int countOfPrimes(int[] array) {
        int primeCount = 0;
        for (int value : array) {
            if (isPrime(value)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    private static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

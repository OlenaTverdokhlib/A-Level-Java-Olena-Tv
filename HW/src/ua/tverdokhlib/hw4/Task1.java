package ua.tverdokhlib.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[400];
        generateRandomArray(numbers);
        double avgArithmetic = calcAvgArithmetic(numbers);
        double avgGeometric = calcAvgGeometric(numbers);
        System.out.println("Среднее арифментическое: " + avgArithmetic);
        System.out.println("Среднее геометрическое: " + avgGeometric);
    }
    public static int[] generateRandomArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }
        return numbers;
    }
    private static double calcAvgArithmetic(int[] numbers) {
        double sum = 0;
        for (double value : numbers) {
            sum += value;
        }
        return(double) sum / numbers.length;

    }
    private static double calcAvgGeometric(int[] numbers) {
        double product = 1;
        for (double value : numbers) {
            product *= value;
        }
        return Math.pow(product, 1.0 / numbers.length);
    }

}

package ua.tverdokhlib.hw4;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

//• Заполнить одномерный массив случайными целочисленными значениями.
//• Все четные значения заменить на нули. Размер массива - 2000 элементов.
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        fillArray(array);
        System.out.println("Исходный массив");
        printArray(array);
        int[] targetArray = replaceEvensWithZeros(array);
        System.out.println("Массив с замененными на нули четными числами");
        printArray(targetArray);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
    }

    private static int[] replaceEvensWithZeros(int[] array) {
        int[] targetArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                targetArray[i] = 0;
            } else {
                targetArray[i] = array[i];
            }
        }
        return targetArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}

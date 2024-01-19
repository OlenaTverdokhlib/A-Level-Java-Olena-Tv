package ua.tverdokhlib.hw4;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Task31 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        fillArray(array);
        System.out.println("Исходный массив");
        printArray(array);
        int[] targetArray = copyArray(array);
        replaceEvenwithZeros(targetArray);
        System.out.println("Массив с замененными на нули четными числами");
        printArray(targetArray);
    }
    private static void fillArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
    }

    public static void replaceEvenwithZeros (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }
    private static int[] copyArray(int[] array) {
       return Arrays.copyOf(array, array.length);
    }
private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i] + " ");
    }
    System.out.println();
}
}

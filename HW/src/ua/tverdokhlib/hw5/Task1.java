package ua.tverdokhlib.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        fillArray(array);
        printArray(array);
    }

    public static void fillArray(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i % 2 == 0) ? value : -value;
                value++;
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println();
            }
            System.out.print(Arrays.toString(array[i]));
        }
    }
}

package ua.tverdokhlib.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[][] sourceArray = new int[2][2];
        fillArray(sourceArray);
        System.out.println("Исходный массив:");
        printArray(sourceArray);
        int[][] targetArray = copyArray(sourceArray);
        int[][] swappedArray = swappedRowsAndColumns(copyArray(sourceArray));
        System.out.println("Массив после замены местами строк и столбцов:");
        printArray(sourceArray);
    }

    private static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(1, 10);
            }
        }
    }

    private static int[][] swappedRowsAndColumns(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] newArray = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        return newArray;
    }

    private static int[][] copyArray(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] copy = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            copy[i] = Arrays.copyOf(array[i],[columns]);
        }
        return copy;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

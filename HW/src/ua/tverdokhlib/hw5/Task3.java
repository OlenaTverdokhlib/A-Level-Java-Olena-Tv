package ua.tverdokhlib.hw5;
//Дан двумерный массив NxN(количество строк = количество столбцов), написать программу,
//которая поменяет местами столбцы и строки.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[][] sourceArray = new int[2][2];
        fillArray(sourceArray);
        System.out.println("Исходный массив:");
        printArray(sourceArray);
        int[][] swappedArray = swappedRowsAndColumns(sourceArray);
        System.out.println("Массив после замены местами строк и столбцов:");
        printArray(swappedArray);
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


    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

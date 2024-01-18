package ua.tverdokhlib.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    //Подсчитать количество слов в строке
    //• Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение, разделяя слова пробелом: ");
        String input = scanner.nextLine();
        int words = wordNumber(input);
        System.out.println("Количество слов в строке, разделенных пробелом: " + words);
    }

    //Считаем количество слов
    public static int wordNumber(String input) {
        input = input.trim();

        String[] words = input.split("\\s+");
        return words.length;

    }
}

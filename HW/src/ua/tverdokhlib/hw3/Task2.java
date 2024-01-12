package ua.tverdokhlib.hw3;

import java.util.Scanner;

public class Task2 {
    //Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)
    //Текст: А роза упала на лапу азорА
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        // Удаление пробелов
        String noSpaces = input.replaceAll(" ", "");
        System.out.println(noSpaces);

        // Проверка на палиндром
        if (isPalindrome(noSpaces)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндромом");
        }
    }

        private static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

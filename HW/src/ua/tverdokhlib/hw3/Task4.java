package ua.tverdokhlib.hw3;

import java.util.Scanner;

public class Task4 {
    //Программа "Угадай число"
    //Задача
    //Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = 0; //Наименьшее загаданное число
        int maxValue = 1000; ////Наибольшее загаданное число
        int userNumber;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        System.out.println("Комьютер загадад число от 0 до 1000. Угадай это число.");

        do {
            System.out.println("Ваше число: ");
            userNumber = scanner.nextInt();
            if (userNumber > randomValue) {
                System.out.println("Много. Попробуйте еще раз. ");
            } else if (userNumber < randomValue) {
                System.out.println("Мало. Попробуйте еще раз. ");
            } else {
                System.out.println("Угадал. Победа! ");
            }
        } while (userNumber != randomValue);

    }
}

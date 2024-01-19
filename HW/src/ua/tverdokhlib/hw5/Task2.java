package ua.tverdokhlib.hw5;

//Проверить заданный массив на упорядоченность по убыванию.
//*передать массив в метод, получить boolean
public class Task2 {
    public static void main(String[] args) {
        int[] array = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0};
        boolean isDescending = checkForDescending(array);
        if (isDescending) {
            System.out.println("Массив упорядочен по убыванию.");
        } else {
            System.out.println("Массив не упорядочен по убыванию.");
        }
    }

    public static boolean checkForDescending(int[] array) {
        if ((array.length == 0) || (array.length < 2)) {
            return true;
        } else {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i - 1] < array[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

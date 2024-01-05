public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        // Результат до обміну
        System.out.println("До обміну");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
// Обмін значень
        a = a^b^(b = a);
        System.out.println("Після обміну");
        System.out.println("a = "+ a + ", b = " + b);
    }
}

public class Task2 {
    public static void main(String[] args) {
        int x1 = 1, y1 = 5;
        int x2 = 3, y2 = 5;
        int x3 = 6, y3 = 7;
       int area = triangleArea(x1, y1, x2, y2, x3, y3);
       System.out.println("Площа трикутника=" + area);
        }
    public static int triangleArea(int x1, int y1, int x2, int y2, int x3, int y3){return
            0.5 * Math.abs((x1 -x2)*(y1 + y2) +(x2 - x3)*(y2 + y3) + (x3 - x1)*(y3 + y1));
    }
}

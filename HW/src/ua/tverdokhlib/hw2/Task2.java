package ua.tverdokhlib.hw2;

public class Task2 {
    public static void main(String[] args) {
        double x1 = 1, y1 = 5;
        double x2 = 3, y2 = 5;
        double x3 = 6, y3 = 7;
        double area = triangleArea(x1, y1, x2, y2, x3, y3);
       System.out.println("Площа трикутника=" + area);
        }
    public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3){return
            0.5 * Math.abs((x1 -x2)*(y1 + y2) +(x2 - x3)*(y2 + y3) + (x3 - x1)*(y3 + y1));
    }
}

package ua.tverdokhlib.hw2;

public class Task4 {
    public static void main(String[] args) {
        int x = -5;
        int y = 7;
        int z = 11;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        int absZ = Math.abs(z);

        if (absX < absY && absX < absZ) {
            System.out.println (x);
        } else if (absY < absX && absY < absZ) {
            System.out.println (y);
        } else {
            System.out.println (z);
        }

}
}

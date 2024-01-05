public class Task4 {
    public static void main(String[] args) {
        int x = -5;
        int y = 7;
        int z = 11;
        if ((Math.abs(x)) < (Math.abs(y)) && (Math.abs(x)) < (Math.abs(z))) {
            System.out.println (x);
        } else if ((Math.abs(y)) < (Math.abs(x)) && (Math.abs(y)) < (Math.abs(z))) {
            System.out.println (y);
        } else {
            System.out.println (z);
        }

}
}

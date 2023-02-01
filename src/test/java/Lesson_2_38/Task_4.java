package Lesson_2_38;

public class Task_4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a + b > c && c + b > a && a + c > b) {
            System.out.println("impossible");
            if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
                System.out.println("right");
            } else if (a * a + b * b < c * c || a * a + c * c < b * b || c * c + b * b < a * a) {
                System.out.println("obtuse ");
            } else if (a * a + b * b > c * c || a * a + c * c > b * b || c * c + b * b > a * a) {
                System.out.println("acute ");

            }
        }
    }
}
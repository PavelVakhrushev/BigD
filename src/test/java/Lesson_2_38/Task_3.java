package Lesson_2_38;

public class Task_3 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        if (year < 30000 && year > 0) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else
            System.out.println("ERROR");
    }
}


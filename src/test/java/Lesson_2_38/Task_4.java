package Lesson_2_38;

public class Task_4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int maxSideTriangle, res;

        if (a < c + b && c < a + b && b < c + a) { // проверяем, возможен ли такой треугольник
            if (a > b) maxSideTriangle = a; // находим наибольшую сторону у треугольника
            else maxSideTriangle = b;
            if (maxSideTriangle < c) maxSideTriangle = c;
            res = a * a + b * b + c * c - 2 * (maxSideTriangle * maxSideTriangle); // считаем знак "+", "-" или "="
            if (res > 0)
            System.out.println("acute");
            else if (res < 0)
                System.out.println("obtuse");
            else
                System.out.println("right");
        } else {
            System.out.println("impossible");
        }
    }
}
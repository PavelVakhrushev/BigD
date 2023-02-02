package Lesson_2_38;

/* В программу через аргументы командной строки передаются
три натуральных числа – стороны треугольника.
Необходимо определить тип треугольника с данными сторонами
(остроугольный, тупоугольный, прямоугольный)
вывести одно из слов:
- right для прямоугольного треугольника,
- acute для остроугольного треугольника,
- obtuse для тупоугольного треугольника
- или impossible, если входные числа не образуют треугольника.
Стороны сторон передаются через аргументы командной строки.
Проверку на наличие аргументов делать не надо.*/

public class Task_4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int maxSideTriangle, res;

        if (a < c + b && c < a + b && b < c + a) { // проверяем, возможен ли такой треугольник (свойства треугольника)
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
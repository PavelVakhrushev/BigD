package Lesson_2_13_1;

import java.nio.channels.Pipe;
import java.util.Scanner;

// Сделал упражнение 2.13 с правками.
public class Circle_2 {

    static final double Pi = 3.14;
    static double radius;

    public Circle_2 (double radius) {
        Circle_2.radius = radius;
    }

    static double getLength() {
        return 2 * radius * Pi;
    }

    static double getArea() {
        return radius * radius * Pi;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение радиуса: ");

        if (scanner.hasNextDouble()) {
            Circle_2.radius = scanner.nextDouble();
            if (Circle_2.radius < 0) {
                System.out.println("Вы ввели некорректное значение");
            } else {
                System.out.println("Площадь круга равна " + getArea());
                System.out.println("Длина окружности равна " + getLength());
            }

        } else {
            System.out.println("Вы ввели некорректное значение");
        }

    }
}






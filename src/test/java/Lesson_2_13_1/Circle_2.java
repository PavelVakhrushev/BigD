package Lesson_2_13_1;

import java.util.Scanner;

public class Circle_2 {
    static double radius;

    public Circle_2(double radius) {
        Circle_2.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static double getLength() {
        return 2 * radius * Math.PI;
    }

    public static double getArea() {
        return radius * radius * Math.PI;
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






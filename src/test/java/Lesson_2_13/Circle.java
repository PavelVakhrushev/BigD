package Lesson_2_13;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        double PI = 3.14;

        Scanner io = new Scanner(System.in);
        System.out.println("Введите радиус : ");
        double radius = io.nextDouble();
        System.out.println("Площадь круга = " + (PI * radius * radius));
        System.out.println("Длина окружности = " + (2 * radius * PI));
    }

}




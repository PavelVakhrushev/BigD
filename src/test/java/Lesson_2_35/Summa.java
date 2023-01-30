package Lesson_2_35;

/* Создать класс Summa, в нем 3 переменные int a,b,c, double x, y, z
Создать и перегрузить метод sum
- возвращающий сумму int от 2х переменных int
- возвращающий сумму double от 3х переменных int
- возвращающий сумму double от 2х и от 3х переменных double
- возвращающий сумму double от 1 int и от 2х переменных double
Значение вызова каждого метода вывести на экран в main
Попробовать создать метод возвращающий double из 2х переменных int
Попробовать создать метод возвращающий double из 2х переменных Integer*/

public class Summa {
    int a, b, c;
    double x, y, z;

    Summa() {
    }

    int sum(int a, int b) {
        return a + b;
    }

    double sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double x, double y) {
        return x + y;
    }

    double sum(double x, double y, double z) {
        return x + y + z;
    }

    double sum(int b, double y, double z) {
        return b + y + z;
    }

    //double sum(int a, int b) { метод закомментирован, данный метод уже использовался
    //    return a + b;
    //}

    double sum(Integer n, Integer m) { //метод возвращающий double из 2х переменных Integer
        return n + m;
    }

    public static void main(String[] args) {
        Summa sum = new Summa();
        Integer n = 6665;
        Integer m = 65554;
        System.out.println("Сумма int от 2х переменных int: " + sum.sum(10, 14));
        System.out.println("Сумма double от 3х переменных int: " + sum.sum(10, 14, 17));
        System.out.println("Сумма double от 2х переменных double: " + sum.sum(5.1, 14.7));
        System.out.println("Сумма double от 3х переменных double: " + sum.sum(5.1, 14.7, 18.9));
        System.out.println("Сумма double от 1 int и от 2х переменных double: " + sum.sum(1, 14.7, 18.9));
        System.out.println("Сумма double из 2х переменных Integer: " + sum.sum(n, m));
    }
}

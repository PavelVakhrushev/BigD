package Lesson_2_42;

/* В основном классе программы объявлена и инициализиована целочисленная переменная n.
Реализуйте метод boolean isPrime(int x), который возвращает true, если x - простое число.
Реализуйте метод int nextInt(int x),
который возвращает случайно сгенерированное целое число от 0 до x, x не включая.

Используя эти методы, напишите программу, которая генерит целые
числа до тех пор, пока не сгенерит простое число.
Для генерации простых чисел можно пользоваться классом
java.lang.Math или java.util.Random.*/

public class Task_4 {
    static int n;


    static int nextInt(int x) {
        return (int) (Math.random() * x);
    }

    static boolean isPrime(int x) {
        return nextInt(x) >= 1 || nextInt(x) / 2 != 0;
    }

    public static void main(String[] args) {

        do {
            n = nextInt(9);
        } while (!isPrime(n));
        System.out.println(n);
    }

}




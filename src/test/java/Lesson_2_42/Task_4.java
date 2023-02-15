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

    public static int nextInt(int x) {
        return (int) (Math.random() * x);
    }

    public static boolean isPrime(int x) {
        if (x <= 1)
            return false;
        else if (x <= 3)
            return true;
        else if (x % 2 == 0 || x % 3 == 0)
            return false;
        int d = 5;
        while (d * d <= x) {
            if (x % d == 0 || x % (d + 2) == 0)
                return false;
            d = d + 6;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        while (true) {
            n = nextInt(100);
            if (isPrime(n)) {
                break;
            }
        }
        System.out.println(n);
    }
}








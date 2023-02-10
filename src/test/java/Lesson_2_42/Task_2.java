package Lesson_2_42;

/* В бригаде, работающей на уборке сена, имеется n сенокосилок.
Первая сенокосилка работала m _часов_, а каждая следующая
на 10 _минут_ больше, чем предыдущая.
Напишите программу, вычисляющую количество сколько часов
проработала вся бригада.
Результат вычислений выведите на экран в часах и минутах.
Например, "Бригада работало 0 часов 30 минут".
Значения n и m программа получает через аргументы командной строки.
Проверку на наличие аргументов делать не надо.
Сделайте проверку, что n и m больше нуля. В противном случае
выведите сообщение об ошибке и завершите программу.*/

public class Task_2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int sum = 0;
        m = m * 60;

        if (n > 0 && m > 0) {

            for (int i = 1; i <= n; i++, m = m + 10)

                sum += m;

            System.out.println("Бригада работала " + sum / 60 + " часа " + sum % 60 + " минут");
        } else {
            System.out.println("ERROR");
        }
    }
}


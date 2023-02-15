package Lesson_2_42;

/* Реализуйте класс Timer, который содержит:
- целочисленное поле seconds - общее число секунд, устанавливается в конструкторе
- статический метод void waitSecond() - метод реализует паузу
одной секунды. Реализовать с помощью цикла.
- метод printTime вывода оставшегося времени в минутах и секундах.
- объектный метод start() - запускает обратный отсчет
и каждую секунды выводит оставшееся количество секунд.

Напишите программу-таймер обратного отсчета в минутах и секундах,

используя созданные класс Timer.
Через аргументы командной строки передается число секунд.

Проверку на наличие аргумента делать не надо.
Нужно проверить, что введенное число больше или равно нуля.
В противном случае выведите сообщение об ошибке
и завершите программу.

Например, для 61 секунды формат вывода:
01:01
01:00
00:59
...
00:01
00:00*/

public class Timer {
    static int seconds;

    public Timer(int seconds) {
        Timer.seconds = seconds;
    }

    public static void waitSecond() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {

        }
    }

    public void printTime() {
        if (seconds >= 60) {
            System.out.println("0" + seconds / 60 + ":" + "0" + seconds % 60);
        } else if (seconds >= 10) {
            System.out.println("0" + 0 + ":" + seconds % 60);
        } else {
            System.out.println("0" + 0 + ":" + "0" + seconds % 60);
        }
    }

    public void start() {
        for (int i = seconds; i >= 0; i--, seconds--) {
            printTime();
            waitSecond();
        }
    }

    public static void main(String[] args) {
        int seconds = Integer.parseInt(args[0]);
        if (seconds > 0) {
            Timer timer1 = new Timer(seconds);
            timer1.start();
        } else {
            System.out.println("ERROR");
        }
    }
}

package Lesson_2_42;
/* Напишите метод snakePrint(int n, int col),
который выводит числа "змейкой" от 1 до n:
    1 2 3 4
    8 7 6 5
    9 10 11 12
    ... n
где:
n - максимальное число
col - количество цифр в одной строке
Выводимые числа разделены пробелами.
Используя реализованный метод, напишите программу, которая через
аргументы командной строки получает целочисленные значения n и col,
а затем печатает соответствующего размера змейку.
Проверку на наличие аргументов делать не надо.
Сделайте проверку, что n больше или равно 1, а m больше 0.
В противном случае выведите сообщение об ошибке
и завершите программу. */

public class Task_3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //n - максимальное число
        int col = Integer.parseInt(args[1]); // col - количество цифр в одной строке
        snakePrint(n, col);
    }

    private static void printRightOrder(int currentNumber, int numbersInRow) {
        for (int i = currentNumber; i < currentNumber + numbersInRow; i++) {
            System.out.print(i + " ");
        }
    }

    static void printReverseOrder(int currentNumber, int numbersInRow) {
        for (int i = currentNumber; i < currentNumber + numbersInRow; i++) {

            System.out.print(i + " ");
        }
    }

    public static void snakePrint(int n, int col) {
        if (n > 1 && col > 0) {
            for (int currentNumber = 1, currentRow = 1; currentNumber <= n; currentNumber += col, currentRow++) {
                if (currentRow % 2 == 1) {
                    printRightOrder(currentNumber, col);
                } else {
                    printReverseOrder(currentNumber, col);
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }
}

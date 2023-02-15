package Lesson_2_42;

/* Реализуйте класс Calculator со статическими методами:
- int add(int x, int y) - выполнение x + y
- int sub(int x, int y) - выполнение x - y
- int mult(int x, int y) - выполнение x * y
- int divide(int x, int y) - выполнение x / y.
  Имеет проверку y == 0 или нет.
  Если равно, то пишется сообщение, что операция не может быть выполнена,
  и программа завершается, используя System.exit(0);

Используя класс Calculator, напишите программу, которая будет
получать через аргументы командной строки два целых числа,
знак операции и после этого выводить результат операции.
через аргументы командной строки.

Пример ввода аргументов:
 10 + 12
 10 - 12
 10 * 12
 10 / 0

Проверку на наличие аргументов делать не надо.
Для проверки знака операции используйте оператор switch.
Если введена неподдерживаемая операция,
то выводить список поддерживаемых операций и завершать программу.*/

public class Calculator {
    static int add(int x, int y) {   // выполнение x + y
        return x + y;
    }
    static int sub(int x, int y) {  // выполнение x - y
        return x - y;
    }
    static int mult(int x, int y) {// выполнение x * y
        return x * y;
    }
    static int divide(int x, int y) {// выполнение x / y.
        return x / y;
    }
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        String b = args[1];
        int y = Integer.parseInt(args[2]);
        if (y == 0) {
            System.out.println("Операция не может быть выполнена ");
            System.exit(0);
        }
        switch (b) {
            case ("+") -> System.out.println(x + " " + b + " " + y + " = " + add(x, y));
            case ("-") -> System.out.println(x + " " + b + " " + y + " = " + sub(x, y));
            case ("*") -> System.out.println(x + " " + b + " " + y + " = " + mult(x, y));
            case ("/") -> System.out.println(x + " " + b + " " + y + " = " + divide(x, y));
            default -> System.out.println("Программа может только +, -, *, /");
        }
    }
}

package Lesson_2_52;
/* Через аргументы командной строки передаются "слова" - последовательность строчных латинских букв и цифр.
Каждый аргумент - отдельное "слово".
Напишите программу, которая выводит слова наибольшей длины.

Сделайте проверку на наличие аргументов командной строки.
Если аргументы не переданы, то выведите соответствующее сообщение и завершите программу.
Сделайте проверку, что "слова" состоят только из строчных латинских букв и цифр.
Иначе выведите сообщение об ошибке и завершите программу. */

public class Task_2_words {

    static String[] str;
    static String max;

    public static void print(String[] str) {

        if (str.length == 0) {
            System.out.println("В командной строке нет аргументов.");
        } else if (str[1].toLowerCase().matches("[a-z0-9]+")) {
            for (String arg : str) {
                if (arg.length() > str[1].length())
                    max = arg;
            }
            System.out.println(max);
        } else {
            System.out.println("Аргументы содержит не корректные символы");
        }
    }


    public static void main(String[] args) {
        str = args;
        print(str);
    }
}
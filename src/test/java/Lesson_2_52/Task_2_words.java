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


    public static void print(String[] str) {

        if (str.length == 0) {
            System.out.println("Аргументы строки не заданы.");
        } else {
            for (String s : str) {
                if (s.matches("[a-z0-9]+")) {
                    System.out.println();
                } else {
                    System.out.println("Аргумент: " + s + " содержит корректные символы");

                }
            }
        }
    }


    public static void main(String[] args) {
        str = args;
        print(str);
        String str1 = str[0];
        for (int j = 1; j < str.length; j++) {
            if (str1.length() < str[j].length())
                str1 = str[j];
        }
        System.out.println("Слово наибольшей длины: " + str1);
    }
}
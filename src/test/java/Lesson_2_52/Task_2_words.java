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
            return;
        }

        String longestWord = str[0];
        int maxLength = longestWord.length();

        for (int i = 1; i < str.length; i++) {
            String str1 = str[i];
            if (!str1.matches("^[a-z-0-9]+$")) {
                System.out.println("Аргумент: " + str1 + " содержит некорректные символы");
                return;
            }
            int length = str1.length();
            if (length > maxLength) {
                maxLength = length;
                longestWord = str1;
            } else if (length == maxLength) {
                longestWord += ", " + str1;
            }
        }
        System.out.println("Самое длинное слово: " + longestWord);
    }

    public static void main(String[] args) {
        str = args;
        print(str);
    }
}
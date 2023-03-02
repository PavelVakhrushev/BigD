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
                    String longestWord = "";
                    for (String str1 : str) {
                        if (str1.length() > longestWord.length())
                            longestWord = str1;
                    }
                    System.out.println("Самое длинное слово: " + longestWord);
                    break;
                } else {
                    System.out.println("Аргумент: " + s + " содержит некорректные символы");
                }
            }
        }
    }


    public static void main(String[] args) {
        str = args;
        print(str);
    }
}
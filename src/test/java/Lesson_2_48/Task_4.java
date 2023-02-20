package Lesson_2_48;

/* Через аргумент командной строки передается строка.
Используя StringBuilder, напишите программу, которая в переданной строке удаляет из неё всё, кроме цифр.
Выведите результирующую строку.

1)
Пример аргумента: 01a10vt0101c
Вывод: 01100101
2)
Пример аргумента: avtc
Вывод:

Проверку на наличие и корректность аргумента делать не надо.*/

public class Task_4 {
    public static void main(String[] args) {
        String str = String.valueOf(args[0]);
        System.out.println("Вывод: " + noLetter(str));
    }

    private static String noLetter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

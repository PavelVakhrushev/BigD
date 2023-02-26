package Lesson_2_48;

/* Через аргумент командной строки передается строка.
Используя StringBuilder, напишите программу,
которая в переданной строке заменяет все нули на единицы и наоборот.
Остальные символы не должны изменится.
Выведите результирующую строку.

Пример аргумента: 01a10vt0101c
Вывод: 10a01vt1010c
Проверку на наличие и корректность аргумента делать не надо.*/
public class Task_3 {

    static String str;

    public static void replace() {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '0') {
                sb.setCharAt(i, '1');
            } else if (c == '1') {
                sb.setCharAt(i, '0');
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        str = args[0];
        replace();
    }
}



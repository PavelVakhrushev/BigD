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
    public static void main(String[] args) {
        String str = String.valueOf(args[0]);
        StringBuilder sb = new StringBuilder(str);
        sb.replace(0, sb.length(), sb.toString().replace("0", "temp")
                .replace("1", "0").replace("temp", "1"));

            System.out.println(sb);
        }
    }



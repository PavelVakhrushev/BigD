package Lesson_2_48;
/* Через аругмент командной строки передается строка - путь до некоторого файла -
содержащая знак «/» или «\». Например, "/bin/java" или "C:\Program Files\Java\bin\java".

Напишите программу, которая для обоих вариантов разделителей, может вывести отдельно путь и имя файла.
Если имя файла отсутствует, т.е. строка оканчивается на "\" или "/",
то выдать ошибку: "Введен некорректный путь до файла."

Пример:
1) Через аргументы передается "/bin/java", выводится:
Путь: /bin/
Имя файла: java

2) Через аргументы передается "C:\Program Files\Java\bin\java", выводится:
Путь: C:\Program Files\Java\bin\
Имя файла: java

3) Через аргументы передается "/", выводится:
Введен некорректный путь до файла.
Проверку на наличие и корректность аргумента делать не надо.
 */

public class Task_2 {

    static String str;

    public static void print() {
        if (str.endsWith("/") || str.endsWith("\\")) {
            System.out.println("Введен некорректный путь до файла");
            return;
        }
        if ((str.contains("/"))) {
            System.out.println("Путь: " + str.substring(0, (str.lastIndexOf("/") + 1)));
            System.out.println("Имя файла: " + str.substring(str.lastIndexOf("/") + 1));
        } else if ((str.contains("\\"))) {
            System.out.println("Путь: " + str.substring(0, (str.lastIndexOf((char) 92) + 1)));
            System.out.println("Имя файла: " + str.substring(str.lastIndexOf("\\") + 1));
        }

    }

    public static void main(String[] args) {
        str = args[0];
        print();
    }
}


package Lesson_2_48;

/* В классе объявлена статическая переменная строкого типа со значением (кавычки не включены):
«Циклом называется многократное выполнение одних и тех же действий.»

Используя только методы класса String (без циклов, условий), напишите программу, которая печатает количество
букв (без пробелов и точки) в переменной до определенного символа (не включая его).
Значение символа передается через аргумент командной строки.

Пример:
Через аргументы передается "Ц", Вывод: 0.
Через аргументы передается "а", Вывод: 7.
Через аргументы передается ".", Вывод: 57.
 */
public class Task_1 {
    static String str = "Циклом называется многократное выполнение одних и тех же действий.";
    public static String arg;

    public String total() {
        return (str.replaceAll(" ", "").substring(0, str.indexOf(arg)));
    }

    public static void main(String[] args) {
        arg = args[0];
        Task_1 task_1 = new Task_1();
        System.out.println("Количество букв: " + task_1.total().length());
    }
}


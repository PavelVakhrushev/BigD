package Lesson_2_38;

/* Через аргументы командной строки передается число от 1 до 7.
Используя оператор switch, напишите программу, печатающую день недели, соответствующий эту числу
(1 - понедельник, 2 - Вторник и тд).
Проверку на наличие аргументов делать не надо.
Надо проверить, что переданное число находится в указанном диапазоне.
В противном случае нужно вывести пользователю сообщение об ошибке, и завершить программу.*/

public class Task_2 {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[2]);
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Error");

        }
    }
}

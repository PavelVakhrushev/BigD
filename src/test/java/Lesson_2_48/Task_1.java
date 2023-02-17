package Lesson_2_48;

public class Task_1 {

    public static void main(String[] args) {
        String str = "Циклом называется многократное выполнение одних и тех же действий.";
        str = str.replaceAll(" ", ""); //убираем пробелы
        int index = str.indexOf(args[0]); // номер буквы в строке
        System.out.println(index);
    }
}


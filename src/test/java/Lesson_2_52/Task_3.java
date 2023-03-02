package Lesson_2_52;
/* Напишите программу, которая создает зубчатый массив целочисленных элементов, сгенеренных случайным образов
в диапазоне -9 до 9.
Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
Выведите массив на экран в порядке убывания сумм элементов строк.*/

public class Task_3 {

    static void array() {
        int[][] a = new int[5][7];
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 19) - 9;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        array();


    }
}

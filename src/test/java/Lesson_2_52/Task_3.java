package Lesson_2_52;
/* Напишите программу, которая создает зубчатый массив целочисленных элементов, сгенеренных случайным образов
в диапазоне -9 до 9.
Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
Выведите массив на экран в порядке убывания сумм элементов строк.*/

import java.util.Arrays;

public class Task_3 {

    static void array() {
        int[][] arr = new int[5][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 19) - 9;
            }
        }
        sortArray(arr);

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static void sortArray(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            int x = getSum(b);
            int y = getSum(a);
            return Integer.compare(x, y);
        });
    }

    public static void main(String[] args) {
        array();
    }
}

package Lesson_2_52;
/* Напишите программу, которая создает зубчатый массив целочисленных элементов, сгенеренных случайным образов
в диапазоне -9 до 9.
Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
Выведите массив на экран в порядке убывания сумм элементов строк.*/

import java.util.Arrays;

public class Task_3 {

    static void array() {
        int rows = 5; // максимальное количестов строк
        int cols = 7; // максимально количество столбцов
        int[][] arr = new int[rows][]; // обявление зубчатого массива
        for (int i = 0; i < arr.length; i++) {
            int colsRandom = (int) (Math.random() * cols + 1); // определение рандомного количества столбцов в строке
            arr[i] = new int[colsRandom]; // выделение памяти на новый массив с рандомным кол-вом столбцов
            for (int j = 0; j < colsRandom; j++) { //заполнение рандомными значениями строк массива
                arr[i][j] = (int) (Math.random() * 19) - 9;
            }
        }
        sortArray(arr); // применение метода сортировки к создаваемому массиву

        for (int i = 0; i < rows; i++) { // вывод массива после сортировки
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int getSum(int[] array) {  // метод для подсчета суммы элементов массива в строке
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static void sortArray(int[][] arr) { // метод для сортировки массива в порядке убывания сумм
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

package Lesson_2_52;
/* Реализуйте метод void fillArray(int[] a),
который устанавливает элементам целочисленного массива а случайные целые числа -9 до 9.

Напишите программу, которая создает массив из 20 целочисленных элементов,
заполняет его случайными значениями, используя метод fillArray,
и печатает его элементы в одну строку, разделив пробелами.*/

import java.util.Arrays;

public class Task_1 {


    static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 19) - 9;  // считаем случайные числа от - 9 до 9
        }
    }

    public static void main(String[] args) {
        int[] b = new int[20]; // устанавливаем длину массива
        Task_1.fillArray(b);
        System.out.println(Arrays.toString(b) + " "); // выводим массив в консоль
    }
}


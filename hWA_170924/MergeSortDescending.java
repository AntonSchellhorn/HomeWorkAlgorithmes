package de.telran.algorithmes.homeWorkAlgoritmes.hWA_170924;

import java.util.Arrays;

public class MergeSortDescending {

    // Метод для сортировки массива слиянием в порядке убывания
    public static void mergeSortDescending(int[] array) {
        if (array.length < 2) {
            return;
        }

        // Разделяем массив на две части
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Рекурсивная сортировка обеих частей
        mergeSortDescending(left);
        mergeSortDescending(right);

        // Слияние отсортированных частей
        merge(array, left, right);
    }

    // Метод для слияния двух отсортированных массивов в порядке убывания
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Пока есть элементы в обеих частях, выбираем наибольшие
        while (i < left.length && j < right.length) {
            if (left[i] >= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Если остались элементы в левой части
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Если остались элементы в правой части
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6, 7};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        mergeSortDescending(array);

        System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));
    }
}

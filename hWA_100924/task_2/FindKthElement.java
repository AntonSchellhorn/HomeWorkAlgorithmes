package de.telran.algorithmes.homeWorkAlgoritmes.hWA_100924.task_2;

public class FindKthElement {

    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int i = 0, j = 0, count = 0, result = -1;

        // Идем по обоим массивам одновременно
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result = arr1[i];
                i++;
            } else {
                result = arr2[j];
                j++;
            }
            count++;

            if (count == k) {
                return result; // Возвращаем элемент на k-й позиции
            }
        }

        // Если элементы остались только в первом массиве
        while (i < arr1.length) {
            result = arr1[i];
            i++;
            count++;
            if (count == k) {
                return result;
            }
        }

        // Если элементы остались только во втором массиве
        while (j < arr2.length) {
            result = arr2[j];
            j++;
            count++;
            if (count == k) {
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int kthElement = findKthElement(arr1, arr2, k);
        System.out.println("Элемент на " + k + "-й позиции: " + kthElement);
    }
}


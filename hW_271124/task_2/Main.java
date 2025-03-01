package de.telran.homeWork.hW_271124.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6};
        int[] arr2 = {2, 3, 4};

        int[] arr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

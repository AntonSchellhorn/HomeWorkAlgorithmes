package de.telran.homeWork.hW_271124.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 4, 5, 5};
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println("Длина нового массива: " + (j + 1));
        System.out.println("Изменнёный массив: ");
        for (int k = 0; k <= j; k++) {
            System.out.print(nums[k] + ",");
        }
    }
}

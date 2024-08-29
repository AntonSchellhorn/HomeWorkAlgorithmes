package de.telran.algorithmes.lesson_1_200824.lesson_2_270824.homeWork_270824;

public class Task3 {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                a = a + i + j;
            }
        }
        System.out.println("Результат Task 3: " + a);
    }
}

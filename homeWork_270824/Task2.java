package de.telran.algorithmes.lesson_1_200824.lesson_2_270824.homeWork_270824;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;

        for (int i = n / 2; i <= n ; i++) {
            for (int j = 2; j <= n ; j *= 2) {
                a = a + n / 2;
            }
        }
        System.out.println("Результат Task 2: " + a);
    }
}

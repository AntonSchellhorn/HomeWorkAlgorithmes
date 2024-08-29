package de.telran.algorithmes.lesson_1_200824.lesson_2_270824.homeWork_270824;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
         if (n == 1) return;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.println("*");
                break;
            }
            System.out.println(); // Переход на новую строку для каждого "i"
        }
    }
}

package de.telran.algorithmes.lesson_1_200824.lesson_2_270824.homeWork_270824;

public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int i = n;

        while (i > 0){
            a = a + i;
            i = i / 2;
        }
        System.out.println("Результат Task 4: " + a);
    }
}

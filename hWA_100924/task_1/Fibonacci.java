package de.telran.algorithmes.homeWorkAlgoritmes.hWA_100924.task_1;

public class Fibonacci {

    // Рекурсивная функция для нахождения n-го числа Фибоначчи
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1; // Первые два числа Фибоначчи равны 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Рекурсивное вычисление
    }

    public static void main(String[] args) {
        // Вывод первых 11 членов последовательности
        int numberOfTerms = 11;
        System.out.println("Первые " + numberOfTerms + " членов последовательности Фибоначчи:");

        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

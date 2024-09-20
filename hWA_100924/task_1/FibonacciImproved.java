package de.telran.algorithmes.homeWorkAlgoritmes.hWA_100924.task_1;

import java.util.HashMap;

public class FibonacciImproved {

    // HashMap для хранения уже вычисленных значений
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    // Улучшенная рекурсивная функция с мемоизацией
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        // Проверяем, вычислено ли уже значение
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Если нет, вычисляем и сохраняем
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int numberOfTerms = 11;
        System.out.println("Первые " + numberOfTerms + " членов последовательности Фибоначчи (улучшенный алгоритм):");

        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

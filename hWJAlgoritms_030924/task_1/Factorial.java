package de.telran.hWJAlgoritms_030924.task_1;
// Итеративный метод для вычисления факториала
public class Factorial {
    public static int factorialIterative(int n){
        int result = 1;
        // Проходим по всем числам от 1 до n и умножаем их
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

}

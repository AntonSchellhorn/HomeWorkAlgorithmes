package de.telran.hWJAlgoritms_030924.task_3;

public class HanoiTower {
    // Рекурсивный метод для решения задачи Ханойской башни
    public static void hanoiRecursive(int n, char fromRod, char toRod, char auxRod){
        if (n == 1){
            System.out.println("Переместите диск 1 с " + fromRod + " на " + toRod);
            return;
        }
        hanoiRecursive(n - 1, fromRod, auxRod, toRod);
        System.out.println("Переместите диск " + n + " с " + fromRod + " на " + toRod);
        hanoiRecursive(n -1, auxRod, toRod, fromRod);
    }
    // Итеративный метод для решения задачи Ханойской башни (может быть сложнее)
public static void hanoiIterative(int n){

    // Реализация итеративного метода сложнее, но её можно выполнить через стеки.
    // Для базового примера можно оставить только рекурсивный подход.

}


}

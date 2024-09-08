package de.telran.hWJAlgoritms_030924.task_3;

import java.util.Scanner;

public class MainTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дисков: ");
        int n = scanner.nextInt();

        System.out.println("Решение Ханойской башни (рекурсивно):");
        HanoiTower.hanoiRecursive(n, 'A', 'C', 'B');
        scanner.close();
    }
}

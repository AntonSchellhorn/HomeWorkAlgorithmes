package de.telran.hWJAlgoritms_030924.task_2;


import java.util.Scanner;

public class MainFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = scanner.nextInt();
        System.out.println("Введите y: ");
        int y = scanner.nextInt();

        int result = FunIteration.funIteration(x, y);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}

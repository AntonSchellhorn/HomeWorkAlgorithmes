package de.telran.algorithmes.lesson_1_200824.homeWork_200824;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {


        //Создаю объект Сканнер для ввода данных с клавы
        Scanner scanner = new Scanner(System.in);
        // Ввод трёх чисел

        System.out.println("Введите первое число (А): ");
        int a = scanner.nextInt();

        System.out.println("Введите первое число (B): ");
        int b = scanner.nextInt();

        System.out.println("Введите первое число (C): ");
        int c = scanner.nextInt();

        // Закрываю Сканнер
        scanner.close();

        // Вычисляем сумму
        int sum = a + b + c;
        System.out.println("Сумма трёх чисел равна : " + sum);
    }
}
package org.telran.lecture_7_dynamic_array.hw.homework_220125;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 уровень сложности: Задача частотного анализа строки заключается в подсчете количества вхождений каждого символа в
 * заданной строке. Это полезно во многих областях, например, в криптографии, лингвистике и сжатии данных.
 * Формулировка задачи:
 * Дана строка s, состоящая из латинских букв. Необходимо определить, сколько раз встречается каждая буква в этой строке.
 * Входной формат:
 * Строка s, содержащая только символы букв латинского алфавита в любом регистре (a-z A-Z). Строка может быть пустой.
 * Выходной формат:
 * Выведите встречающиеся символы в строке с указанием их количества.
 * Пример:
 * "АbraСadabra"
 * Результат:
 * a - 5
 * b - 2
 * r - 2
 * c - 1
 * d - 1
 * Важно! При подсчете не учитывается регистр, a и A - одинаковые.
 */

public class Solution {
    public static void main(String[] args) {
        String word = "AbraCadabra"; // Входная строка

        // Приводим строку к нижнему регистру и превращаем в массив символов
        char[] symbols = word.toLowerCase().toCharArray();

        // Создаём Map для хранения частот букв
        Map<Character, Integer> counts = new HashMap<>();

        // Проходим по всем символам в строке
        for (char symbol : symbols) {
            // Если символ уже есть в Map, увеличиваем его счётчик, иначе добавляем с 1
            counts.put(symbol, counts.getOrDefault(symbol, 0) + 1);
        }

        // Выводим результат в формате "буква - количество"
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

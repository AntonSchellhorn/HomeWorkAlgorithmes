package de.telran.hWJAlgoritms_030924.task_2;

public class FunIteration {
    // Итеративный метод на основе рекурсивного
    public static int funIteration(int x, int y){
        while (x != 0){
            int res = x + y;
            System.out.println("res = " + res + "; x = " + x + "; y = " + y);
            x = x - 1;
            y = res;
        }
        return y;
    }
}

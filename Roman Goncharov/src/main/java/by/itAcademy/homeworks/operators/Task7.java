package by.itAcademy.homeworks.operators;

/** Задание 7
 * Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 * Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int r = console.nextInt();
        areaComparison(a,b,r);
    }

    public static void areaComparison (int a, int b, int r) {
        if (r*2 >= Math.sqrt(a*a + b*b)) {
            System.out.println("Картонка радиусом "+ r + " полностью закрывает прямоугольное отверстие " +
                    "размерами a=" + a + " и b=" + b);
        } else {
            System.out.println("Картонка радиусом "+ r + " не закрывает прямоугольное отверстие " +
                    "размерами a=" + a + " и b=" + b);
        }
    }
}

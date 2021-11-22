package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**Задание06:
 определить, является ли последняя цифра в числе семеркой
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int x = in.nextInt();
        if (x%10==7)
            System.out.println("последняя цифра в числе 7");
        else System.out.println("последняя цифра в числе не равна 7");
    }
}

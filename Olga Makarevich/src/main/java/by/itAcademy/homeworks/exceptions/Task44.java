package by.itAcademy.homeworks.exceptions;

// Написать собственное исключение от Exception.
// Сгенерировать код, который будет выбрасывать его и обрабатывать.
// Результат работы программы вывести на экран.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task44 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                try {
                    throw new MyException("Цифра 9 не любимая");
                } catch (MyException e) {
                    System.out.println("Массив должен исключать цифру 9");
                }
            }
        }
    }
}
//
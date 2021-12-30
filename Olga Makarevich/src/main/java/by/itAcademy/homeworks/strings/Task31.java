package by.itAcademy.homeworks.strings;

// Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора сложения и
// String, а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
// Выведите сравнение на экран.

import java.nio.MappedByteBuffer;

public class Task31 {
    public static void main(String[] args) {
        String string = "aabbcc";
        System.out.println("Сложение строк +: " + sumString(string)/1000);
        System.out.println("Сложение строк StringBuilder:" + sumStringSB(string)/1000);
    }

    public static double sumString(String someString) {
        System.gc();
        final double startTime = System.currentTimeMillis();
        String someStringSumMill = null;
        for (int i = 0; i < 10000; i++) {
            someStringSumMill += someString;
        }
        return System.currentTimeMillis() - startTime;
    }

    public static double sumStringSB(String someString) {
        System.gc();
        final double startTime = System.currentTimeMillis();
        StringBuilder someStringSBSumMill = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            someStringSBSumMill.append(someString);
        }
        return System.currentTimeMillis() - startTime;
    }
}

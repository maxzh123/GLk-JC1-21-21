package by.itAcademy.homeworks.arrays;

// Создайте переменную для массива из 10 элементов.
// Заполните его произвольными значениями целочисленного типа.
// Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).

import java.util.Arrays;

import static java.lang.System.*;

public class Task22 {
    public static void main(String[] args) {
        int [] arrayСirculation = ArraysHelper.arrayRandom(10);
        out.println(Arrays.toString(arrayСirculation));
        out.println(Arrays.toString(arrConversely(arrayСirculation)));
    }

    public static int[] arrConversely (int [] arrConversely) { // НЕ РАБОТАЕТ
        int conversely = 0;
        for (int i = arrConversely[arrConversely.length-1]; i < arrConversely.length; i--) { // логика начиная с последнего, каждый индекс объявлять первым, вторым и т.д.
            arrConversely[i] = arrConversely[conversely];
            conversely++;
        }
        return arrConversely;
    }
}

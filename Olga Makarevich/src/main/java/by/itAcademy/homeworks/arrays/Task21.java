package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
//Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа. Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
// Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.

public class Task21 {
    public static void main(String[] args) {
        System.out.println("Сумма элементов = " + sumBetweenMinMax(/*я не понимаю что здесь должно быть написано*/));
    }

    public static int sumBetweenMinMax() { //логика такая: найти индекс элемента массива с max значением и индекс элемента массива с min значением; значение каждого индекса, следующего за индексом с min значением прибавить к 0 вплоть до индекса с max значением; все равно работает некорректно, если вообще работает
        int[] arr = ArraysHelper.arrayRandom(10);  // вторую часть задания я не поняла: нужно найти СУММУ, которая включает повторяющися максимальные значения, т.к. один из индексов min/max будет больше/меньше повторяющегося значения?
        System.out.println(Arrays.toString(arr));

        int maxIndex = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxIndex) {
                maxIndex = arr[i];
            }
            return maxIndex;
            //System.out.println(maxIndex);
        }

        int minIndex = arr[0];
        for(int i = 1; i<arr.length;i++) {
        if (arr[i] < minIndex) {
            minIndex = arr[i];
        }
        return minIndex;
    }

        int sum = 0;
        for (int i = arr[minIndex + 1]; i < arr[maxIndex]; i++) {
            sum += arr[i];
        }
            return sum;
    }
}

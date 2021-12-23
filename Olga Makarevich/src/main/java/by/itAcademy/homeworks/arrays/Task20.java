package by.itAcademy.homeworks.arrays;

// Создайте переменную для массива из 10 элементов.
// Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.

public class Task20 {
    public static void main(String[] args) {
        int[] arriveRandom3 = new int[10];
        for (int i = 0; i < arriveRandom3.length; i++) {
            arriveRandom3[i] = (int) (Math.random() * 1000 + 1);
            System.out.println(arriveRandom3[i]);
        }
        int max = getMax(arriveRandom3);
        System.out.println("Maximum value is: " + max);
    }

    private static int getMax(int[] arriveRandom3) {
        int maxValue = arriveRandom3[0];
        for (int i = 1; i < arriveRandom3.length; i++) {
            if (arriveRandom3[i] > maxValue) {
                maxValue = arriveRandom3[i];
                System.out.println("Индекс максимального элемента = " + i);
            }
        }
        return maxValue;
    }
}
//
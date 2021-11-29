package by.itAcademy.homeworks.arrays;

/* Создайте переменную для массива из 10 элементов. Заполните его
произвольными значениями целочисленного типа. Найдите максимальный элемент
и выведите его индекс. */

public class Task20 {
    public static void main(String[] args) {
        int[] myThirdArray = Task18.getHelperToCreateArray(10);
        int indexOfMaxValue = getMaximumInArray(myThirdArray);
        int maxValue = myThirdArray[indexOfMaxValue];

        System.out.println("Maximum value is " + maxValue + ". Index is " + indexOfMaxValue);
    }

    public static int getMaximumInArray(int[] array) {
        int maxValue = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                index = i;

            }
        } return index;
    }
}

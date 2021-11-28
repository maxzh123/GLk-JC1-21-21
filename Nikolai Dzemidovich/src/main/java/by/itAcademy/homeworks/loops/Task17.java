package by.itAcademy.homeworks.loops;

import by.itAcademy.homeworks.types.MyReadHelper;

public class Task17 {

    /*У меня проблема. Если вводишь число, которое делиться без остатка на 3, то при выведении в бух формате, вначале приписывается ноль
    Идея моя состоит в том, чтобы остатки от деления числа засунуть в массив, потом вывести его обратной последовательностью
     */
    public static void main(String[] args) {

        long number = MyReadHelper.readInt("число");

        int countOfDigits = getCountOfDigits(number);

        int arrayLength = Math.round(countOfDigits / 3);

        int[] array = new int[arrayLength + 1];

        for (int i = 0; number != 0; i++) {
            array[i] = (int) (number % 1000);
            number /= 1000;
            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static int getCountOfDigits(long number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}



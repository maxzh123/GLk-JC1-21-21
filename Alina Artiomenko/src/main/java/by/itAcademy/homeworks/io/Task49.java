package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**Задание 49
 * 1. Записать в двоичный файл 20 случаных чисел
 * 2. Прочитать файл
 * 3. Вывести на экран числа
 * 4. Вывести на экрна среднеее арифметическое этих чисел
 */

public class Task49 {
    public static void main(String[] args) throws IOException {
        final int valueOfNumber = 20;
        WorkWithFileNew task49 = new WorkWithFileNew("Task49.bin");
        task49.createNewFile();

        task49.writeToBinaryFile(getRandomNumbers(valueOfNumber));

        List<Integer> list = task49.readBinaryFile();
        System.out.println("Список чисел: " + list);
        System.out.println("Среднее арифметическое: " + getAverage(list));
    }

        public static int[] getRandomNumbers (int value){
            int[] number = new int[value];
            for (int i = 0; i < value; i++) {
                number[i] = (int) (Math.random() * 10 + 7);
            }
            return number;
        }
        public static double getAverage(List<Integer> list){
            int sum = 0;
            double result = 0.0;
            for(Integer arr : list){
                sum += arr;
            }
            result = (double) sum / list.size();
            return result;
        }
}

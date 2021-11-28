package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**Задание 20
 * > Создайте переменную для массива из 10 элементов. Заполните его
 * > произвольными значениями целочисленного типа. Найдите максимальный элемент
 * > и выведите его индекс.
 */

public class Task20 {
    public static void main(String[] args) {

        int[] arrayNumber = Task20.fillArrayWithNumber(10);
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println(MaxArrayNumber(arrayNumber));
    }

        public static int[] fillArrayWithNumber (int value){
            int[] arrayRandom = new int[value];
            for (int i = 0; i < arrayRandom.length; i++) {
                arrayRandom[i] = (int)(Math.random() * 10 + 15);
            }
            return arrayRandom;
        }

        public static String  MaxArrayNumber(int[] array){
            String result = "";
            int index = 0;
            int maxValueArray = array[0];
            for(int i = 0; i < array.length; i++){
                if (array[i] > maxValueArray){
                    maxValueArray = array[i];
                    index = i;
                }
            }
           return result = "[" + index + "] = " + maxValueArray + " - МАХ значение";
        }
    }

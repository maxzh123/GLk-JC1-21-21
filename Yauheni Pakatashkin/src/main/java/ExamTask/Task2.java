package ExamTask;

import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * Сгенерировать массив случайных целых чисел, величина которых, по модулю, не превышает 300 (-300 ... 300).
 * Число элементов массива равно 10. Найти максимальное и минимальное числа в массиве и вывести на экран.
 * Заменить максимальный элемент на минимальный, умноженный на максимальный.
 */

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[10];
        filling(array);
        System.out.println(Arrays.toString(array));
        foundMaxAndMin(array);
        replacement(array);

    }

    public static void filling(int [] array){
        for (int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random()*(600+1))-300;
        }
    }


    public static void foundMaxAndMin(int [] array){
        int MAX = array[0];
        int MIN = array[0];
        for (int i =1; i<array.length; i++){
            if(MAX < array[i]){
                MAX = array[i];
            }
            if(MIN>array[i]){
                MIN = array[i];
            }
        }
        System.out.println("Максимальное значение массива = " + MAX);
        System.out.println("Минимальное значение массива = " + MIN);
    }

    public static void replacement(int [] array){
     sort(array);
     int tmp = array[0]*array[array.length-1];
     array[array.length-1] = tmp;
        System.out.println("Массив после замены максимального элемента");
        System.out.println(Arrays.toString(array));
    }
}

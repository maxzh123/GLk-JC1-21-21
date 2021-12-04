package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Создать массив на 10 чисел,
 * найти сумму чисел между максимумом и минимумом
 * если их несколько, то использовать максимальную разницу
 */
public class Task21 {// еще не решил, думаю как искать если несколько элементов
    public static void main(String[] args) throws Exception{
        int [] array = FillingTheArray.array(10,10);
        System.out.println(Arrays.toString(array));


    }

    private static int foundMax(int[]array){
        int Max = array[0];
        for (int i = 1; i<array.length; i++){
            if(array[i]>Max){
                Max=array[i];
            }
        }
        return Max;
    }
    private static int foundMin(int[]array){
        int Min = array[0];
        for (int i = 1; i<array.length; i++){
            if(array[i]<Min){
                Min=array[i];
            }
        }
        return Min;
    }
}

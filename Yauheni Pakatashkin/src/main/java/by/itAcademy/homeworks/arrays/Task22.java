package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {
        int [] array = FillingTheArray.Array(10);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(myReverse(array)));

    }

    public static int[] myReverse(int[] array ){

        for(int i = 0; i<array.length/2; i++){
            int tmp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=tmp;
        }
        return array;
    }
}

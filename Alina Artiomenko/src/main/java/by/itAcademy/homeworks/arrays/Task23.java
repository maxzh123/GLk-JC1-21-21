package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**Задание 23
 * 1.Создать двухмерный квадратный массив и заполнить его «бабочкой»
 */

public class Task23 {
    public static void main(String[] args) {
        int arraySize = 4;
        int [][] array = Task23.fillingButterflyArray(arraySize);

        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }


        //заполнение квадратного массива "бабочкой"
        public static int[][] fillingButterflyArray (int size){
            int[][] array = new int[size][size];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i == j) || (i == (array[i].length - 1 - j)) || // главная и побочная диагональ
                       ((i < j) && (i < (array[i].length - 1 - j))) || //элементы массива над главной и побочной диагональю
                       ((i > j) && (i > (array[i].length - 1 - j)))) { //элементы массива под главной и побочной диагональю
                            array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                }
            }
            return array;
        }
    }

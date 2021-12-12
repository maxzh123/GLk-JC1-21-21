package by.itAcademy.homeworks.arrays;

// Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
//
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1

import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) {
        int [][] butterfly = new int[5][5];
        System.out.println(arr(butterfly)); // НЕ ПОНИМАЮ КАК НАПЕЧАТАТЬ
        }

    public static int[][] arr(int[][] arr) {
        int x = 0; // скорее всего 0 здесь зря написан
        arr = new int[x][x];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; j++) {
                if (i == 1 || i == arr.length-1) {
                    j = 1;
                } else if (i == 2 || i == arr.length-2) {
                    if ((arr[i][j] == arr[i][0]) || arr[i][j] == arr[i][arr[i].length-1]) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                } else if (i == 3) {
                    if (j < 3 && j > 3) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                }
            }
        }
        return arr;
    }
}


package by.itAcademy.homeworks.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**Создать двумерный массив
 * заполнить его бабочкой(между основной и побочной диагоналями)
 *
 */
public class Task23 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i)))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;

            }
        }
        for (int i=array.length-1; i>=array.length/2; i--){
            for (int j=0; j<array[i].length; j++){
                if ((j<(array[i].length-1-i)) || (j>i))
                    array[i][j]=0;
                else
                    array[i][j]=1;}
        }

        for (int i = 0; i<array.length; i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }
    }


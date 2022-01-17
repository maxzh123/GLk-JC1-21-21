package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Задание10:
 проверить, поместяться ли два дома на участке, заданных размеров
 **/

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размеры домов:");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Введите размеры участка:");
        int e = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());
        System.out.println(compareSquare(a, b, c, d, e, f));
    }
    public static String compareSquare(int a, int b, int c, int d, int e, int f) {
        String result = "";
        if((e >= a + c && f >= b && f >= d)||
          (e >= b + d && f >= a && f >= b) ||
          (f >= a + c && e >= b && e >= d) ||
          (f >= b + d && e >= a && e >= b)) {
            return result = "два дома поместятся на участке";
            }
        else{
            return result = "два дома не поместятся на участке";
        }
    }
}








package by.itAcademy.homeworks.operators;
/** Задание 10
 *
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти
 * дома на данном участке. Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());
        if (e*f > ((a*b)+(c*d))){
            System.out.println("Дома помещаются на данном участке");
        } else{
            System.out.println("Дома не поместятся на данном участке");
        }

    }
}

package by.itAcademy.homeworks.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Задание12:
 Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 **/
public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое целое число от 0 до 10:");
        int x=Integer.parseInt(reader.readLine());
        FaktCount(x);
    }
    private static void FaktCount(int x){
        int i=1;
        int f=1;
        while (i<=x)
        {
            f=f*i;
            i++;
        }
        System.out.println("Факториал " + x + " равен " + f);
    }
}




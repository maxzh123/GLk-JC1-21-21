package by.itAcademy.homeworks.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Задание17:
 Задать произвольное целое число и вывести его в бухгалтерском формате
 **/
public class Task17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое целое число :");
       // long x=Integer.parseInt(reader.readLine());
        long x = Long.parseLong(reader.readLine());
        spaceCount(x);
    }
    private static void spaceCount(long x){
        long f;
        String s;
        s="";
        while (x%1000!=0)
        {
            f=x%1000;
            x=x/1000;
            s= f + " " + s;
        }
        System.out.println(s);
    }
}

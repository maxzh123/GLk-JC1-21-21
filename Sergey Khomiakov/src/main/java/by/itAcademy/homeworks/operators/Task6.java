package by.itAcademy.homeworks.operators;

/*
> Создайте метод с одним целочисленным параметром. Метод должен
> определить, является ли последняя цифра числа семеркой и вернуть boolean
> значение.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task6 {
    static int number;
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            number = Integer.parseInt(reader.readLine());
            System.out.println(getSeven(number));
        } catch (Exception ex){
            System.out.println("Some mistakes...ups");
        }
    }

    private static boolean getSeven(int a){
        if (a%10==7){
            return true;
        }
        else{
            return false;
        }
    }
}

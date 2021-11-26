package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(reader.readLine());
        System.out.println(money + " рубля");
    }
}

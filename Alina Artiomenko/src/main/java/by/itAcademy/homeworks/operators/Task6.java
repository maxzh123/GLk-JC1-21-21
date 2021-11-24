package by.itAcademy.homeworks.operators;

/** Задание 06
 * 1. Ввод целочисленного параметра
 * 2. Является ли последняя цифра числа семёркой
 * 3. Вернуть true или false
 */

import java.io.*;

public class Task6 {
    public static void main(String[] args){
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целочисленной число: ");
        try {
            int num = Integer.parseInt(inputNum.readLine());
            System.out.print(lastDigitSeven(num));
        } catch (Exception ex){
            System.out.print("Некоректный вовод!");
        }
    }

    public static boolean lastDigitSeven(int x){
        if (x % 10 == 7){
            return true;
        } else {
            return false;
        }
    }
}



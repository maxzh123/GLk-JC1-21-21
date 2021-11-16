package by.itAcademy.homeworks.operators;

//Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.

import java.util.Scanner;

public class Task6 {
  
  public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int number = scr.nextInt();
        boolean last = (number % 10) == 7;

        if (last) {
            System.out.println(last);
        } else {
            System.out.println(last);
        }
    }
}

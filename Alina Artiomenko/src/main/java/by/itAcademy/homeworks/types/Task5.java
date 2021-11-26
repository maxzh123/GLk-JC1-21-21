package by.itAcademy.homeworks.types;

/** Задание 05
* 1. Ввод числа, где число - это количество секунд
* 2. Вывести число в виде WW недель DD дней MM минут SS секунд
**/

import java.util.Scanner;

public class Task5 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Введите количество секунд - ");
    int T = input.nextInt();
    
    int SS = T % 60;
    int MM = ((T - SS) / 60) % 60;
    int HH = ((T - MM * 60) / 3600) % 24;
    int DD = (((T - HH * 3600) / 3600) / 24) % 7;
    int WW = (((T - DD * 86400) / 3600) / 24) / 7;
    System.out.print(String.format(T + " секунд = " + "%d"+" недели(я) " + "%02d" + " суток " + "%02d" + " часов " + "%02d" + " минут "  + "%02d" + " секунд", WW, DD, HH, MM, SS));
  }
}

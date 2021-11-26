package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task8 {
    public static void getMoney() {
        System.out.print("Введите сумму : ");
        Scanner scn = new Scanner(System.in);
        int money = scn.nextInt();
        int a = money % 10;
        if (money > 10 && money < 20) {
            System.out.println(money + " рублей");
        } else {
            switch (a) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(money + " рублей");
                    break;
                case 1:
                    System.out.println(money + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(money + " рубля");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        getMoney();
    }
}

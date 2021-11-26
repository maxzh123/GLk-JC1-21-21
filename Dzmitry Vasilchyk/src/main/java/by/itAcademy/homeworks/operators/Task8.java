package by.itAcademy.homeworks.operators;

import java.util.Scanner;

/**Задание08:
 вывести сумму денег в рублях в правильном падеже
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int r = in.nextInt();
        countMoney(r);
    }
    private static void countMoney(int r){
        if (r>4 && r<21)
            System.out.println("У Вас " + r + " рублей");
        else {
            if (r%10==0)
                System.out.println("У Вас " + r + " рублей");
            else {
                if (r%10==1)
                    System.out.println("У Вас " + r + " рубль");
                else {
                    if (r%100==12 || r%100==13 || r%100==14)
                        System.out.println("У Вас " + r + " рубля");
                    else {
                    if (r%10==2 || r%10==3 || r%10==4)
                        System.out.println("У Вас " + r + " рубля");
                    else System.out.println("У Вас " + r + " рублей");
                         }
                    }
                }
            }
        }

    }


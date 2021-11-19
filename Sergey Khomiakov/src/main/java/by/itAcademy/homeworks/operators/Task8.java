package by.itAcademy.homeworks.operators;
/*
Задать целое число в виде переменной, это число – сумма денег в рублях.
> Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */

public class Task8 {
    public static void main(String[] args) {
        int amountOfMoney;

        amountOfMoney = 31;

       if(amountOfMoney>=0){
           if (amountOfMoney%10==0 || amountOfMoney%10==5 || amountOfMoney%10==6 ||
                   amountOfMoney%10==7 || amountOfMoney%10==8 ||amountOfMoney%10==9 ||amountOfMoney%100==11 ||
                   amountOfMoney%100==12|| amountOfMoney%100==13 || amountOfMoney%100==14){
               System.out.println(amountOfMoney + " рублей");
           } else if (amountOfMoney%10==2 || amountOfMoney%10==3 || amountOfMoney%10==4){
               System.out.println(amountOfMoney + " рубля");
           } else{
               System.out.println(amountOfMoney + " рубль");
           }

       } else {
           System.out.println("Вы вввели отрицательную сумму денег, капец! Неужели вы кому-то должны?");
       }

       }



}

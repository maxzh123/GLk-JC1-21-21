package by.itAcademy.homeworks.operators;

/**Задание 08
 * Задать целое число в виде переменной, это число – сумма денег в рублях.
 * Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже
 */

import java.io.*;

public class Task8 {
    public static void main(String[] args){
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число: ");
        try {
            int amount = Integer.parseInt(inputNum.readLine());
            if (amount < 0) {
                System.out.print("Введено отрицательное число!");
            } else {
                System.out.print(amount + correctCases(lastCharacter(amount)));
            }
        } catch (Exception ex){
            System.out.print("Неверно введенны данные!");
        }
    }

    public static int lastCharacter(int number){
        return number % 10;
    }

    public static String correctCases(int x) {
        if (x == 1) {
            return " рубль";
        } else if ((x == 0) || ((x > 5) && (x < 10))){
            return " рублей";
        } else {
            return " рубля";
        }
    }
}

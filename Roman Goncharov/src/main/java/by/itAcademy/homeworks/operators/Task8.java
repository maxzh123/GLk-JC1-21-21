package by.itAcademy.homeworks.operators;

/** Задание 8
 * Задать целое число в виде переменной, это число – сумма денег в рублях.
 * Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
 */

public class Task8 {
    public static void main(String[] args) {
        int money = 12823;
        caseMatching(money);
    }

    public static void caseMatching (int rub) {
        if (rub % 10 == 1 && rub % 100 != 11) {
            System.out.println(rub + " Рубль");
        } else if (rub % 10 == 2 && rub % 100 != 12 || rub % 10 == 3 && rub % 100 != 13 || rub % 10 == 4 && rub % 100 != 14) {
            System.out.println(rub + " Рубля");
        } else {
            System.out.println(rub + " Рублей");
        }
    }
}

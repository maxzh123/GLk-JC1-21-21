package by.itAcademy.homeworks.operators;
/** Задание 8
 *
 * Задать целое число в виде переменной, это число – сумма денег в рублях. Вывести это число на экран, добавив
 * к нему слово «рублей» в правильном падеже
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(reader.readLine());
        switch (money % 10) {
            case 1:
                System.out.println(money + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(money + " рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(money + " рублей");
                break;
            default:
                System.out.println("что-то пошло не так");
        }
    }
}

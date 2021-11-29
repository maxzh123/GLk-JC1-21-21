package by.itAcademy.homeworks.loops;

import java.text.DecimalFormat;

// Задание 17
// Задать произвольное число и вывести его в бухгалтерском формате.

public class Task17 {
    public static void main(String[] args) {
        int num = 1832193128;
        System.out.println(num);
        if (num < 0) {
            System.out.println("-" + newFormat(num));
        } else {
            System.out.println(newFormat(num));
        }
    }

    public static String newFormat(int num) {
        int number = Math.abs(num);
        int firstNum = number;
        DecimalFormat dF = new DecimalFormat("000");
        String result = "";
        do {
            if (number/1000 == 0) {
                result = number%1000 + "".concat(result);
                break;
            }
            String remainder = " ".concat(dF.format(number%1000));
            if (number == firstNum) {
                result = remainder;
                number = number/1000;
                continue;
            }
            number = number/1000;
            result = remainder.concat(result);
        } while (number != 0);
        return result;
    }
}

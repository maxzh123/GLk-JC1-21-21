package by.itAcademy.homeworks.loops;

// Посчитать сумму цифр числа 7893823445 с помощью цикла do while.

import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(Task14.sumOfNumb(7893823445L));
    }

    public static int sumOfNumb(long numb) {
        int sum = 0;
        do {
            sum += numb % 10;
            numb /= 10;
        } while (numb != 0);
        return sum;
    }
}
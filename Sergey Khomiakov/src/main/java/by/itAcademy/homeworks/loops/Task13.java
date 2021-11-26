package by.itAcademy.homeworks.loops;

/*
Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */


import java.math.BigInteger;

public class Task13 {

    public BigInteger getFactorialFrom0to25(){
        int count = 1;
        BigInteger factorial = new BigInteger("1");
        do{
            factorial = factorial.multiply(BigInteger.valueOf(count));
            count++;
        } while (count<=25);
        return factorial;
    }
}

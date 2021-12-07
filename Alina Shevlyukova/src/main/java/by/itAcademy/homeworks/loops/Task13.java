package by.itAcademy.homeworks.loops;

import java.math.BigInteger;

public class Task13 {
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        int i = 1;
        do{
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }
         while (i <= 26);
         System.out.println("Factorial of 26 = " + factorial);

        }
    }



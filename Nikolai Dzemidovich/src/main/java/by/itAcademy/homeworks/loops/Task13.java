package by.itAcademy.homeworks.loops;

import java.math.BigInteger;
import java.sql.SQLOutput;


public class Task13 {
    public static void main(String[] args) {

        BigInteger factorials = makeFaktorial(25);
        System.out.println(factorials);


    }

    public static BigInteger makeFaktorial(int maxNumberOfFatroial) {

        BigInteger factorials = new BigInteger("1");
        int number = 1;

        do {
            factorials = factorials.multiply(BigInteger.valueOf(number));
            number++;
        } while (number <= maxNumberOfFatroial);
        System.out.print("Факториал числа " + maxNumberOfFatroial + " = ");

        return factorials;
    }

}

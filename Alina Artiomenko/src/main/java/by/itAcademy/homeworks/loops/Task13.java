package by.itAcademy.homeworks.loops;

import java.math.BigInteger;

/**Задание 13
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */
public class Task13 {
    public static void main(String[] args){
        BigInteger multiplication = new BigInteger("1");
        int count = 1;

        do{
            multiplication = Multiplication(multiplication,count);
            System.out.println("Произведение от 1 до " + count + " = " + multiplication);
            count++;
        } while (count < 26);
    }

    public static BigInteger Multiplication(BigInteger mult, int count){
        mult = mult.multiply(BigInteger.valueOf(count));
        return mult;
    }
}

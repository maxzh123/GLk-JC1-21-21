package by.itAcademy.homeworks.loops;
/** Задание 14
 *
 * Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Task14 {
    public static void main(String[] args) {
        long currentDigit = 7893823445L;
        System.out.println("Получим сумму = " + sumDigitsInNumber( 7893823445L)) ;
    }
        public static int sumDigitsInNumber ( long currentDigit){
            int result = 0;
            do {
                result += currentDigit % 10;
                currentDigit /= 10;
            }
            while (currentDigit > 0);
            return result;

        }
    }

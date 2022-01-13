package by.itAcademy.homeworks.lamda;

/**Задание 61
 * 1. Напишите программу, которая для всех чётных значений длиной от 1 от 20 дюймов:
 *    - печатает на экран значения в дюймах
 *    - переводит значения в сантиметрах
 *    - печатает на экран сумму в сантиметрах
 */

public class Task61 {
    public static void main(String[] args) {

        Inch inch = numberInInch -> numberInInch;
        Inch inch1 = numberInCm -> numberInCm * 2.54;

        final int intervalA = 1;
        final int intervalB = 20;

        printNumberInInch(inch, intervalA, intervalB);
        printNumberInCm(inch1, intervalA, intervalB);
        System.out.println("Сумма чисел = " + getSumInCm(inch1, intervalA, intervalB) + " см");
    }

    static void printNumberInCm(Inch number, int a, int b){
        for (int i = a; i < b + 1; i++){
            if (i % 2 == 0){
                System.out.println(i + " дюймов = " + number.getNumber(i) + " см");
            }
        }
    }

    static void printNumberInInch(Inch number, int a, int b){
        for (int i = a; i < b + 1; i++){
            if (i % 2 == 0){
                System.out.println(number.getNumber(i) + " дюймов");
            }
        }
    }

    static double getSumInCm(Inch number, int a, int b){
        int sum = 0;
        for (int i = a; i < b + 1; i++){
            if (i % 2 == 0){
                sum += number.getNumber(i);
            }
        }
        return sum;
    }
}

package by.itAcademy.homeworks.types;

//Написать метод, который принимает на вход два целых числа, делает их суммирование и складывает результат с произведением двух
//этих чисел, и возвращает полученный результат из метода. Передать на вход в метод любые два числа.
// Вывести полученный результат работы метода на экран

import java.util.Scanner;

//public class Task4 {
//    public static void main(String[] args) {
//        Scanner num = new Scanner(System.in);
//        int a = num.nextInt();
//        int b = num.nextInt();
//        System.out.println(getExpression(a, b));
//    }
//
//    public static int getExpression(int a, int b) {
//        return a + b + a * b;
//    }
//}

// Second try
public class Task4 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000 + 1);
        int b = (int) (Math.random() * 1000 + 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(sunAndMultiplication(a, b));

    }

    static int sunAndMultiplication(int a, int b) {
        int sunAndMultiplication = a + b + a * b;
        return sunAndMultiplication;
    }

}
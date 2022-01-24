package by.itAcademy.homeworks.lamda;

import java.util.stream.Stream;

/** Задание 61
 * 1) Создать программу, которая для всех четных значений длиной от 1 до 20 дюймов:
 * 2) - печатает на экран значения в дюймах;
 * 3) - переводит значения в сантиметры;
 * 4) - печатает на экран сумму в сантиментах.
 */

public class Task61 {
    public static void main(String[] args) {
        double sum = Stream.iterate(1, n -> n + 1)
                .limit(20)
                .filter(intValue -> intValue%2==0)
                .peek((intValue) -> System.out.print(intValue + " inches; "))
                .mapToDouble(doubleValue -> doubleValue *2.54)
                .reduce(0, Double::sum);

        System.out.println("\n" + "Количество сантиметров - " + sum);
    }
}

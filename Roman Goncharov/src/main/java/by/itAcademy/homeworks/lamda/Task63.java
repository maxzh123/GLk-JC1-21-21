package by.itAcademy.homeworks.lamda;

/**
 * Задание 63
 * Сгенерируйте List коллекцию целых чисел из n элементов от minValue до maxValue.
 * Определить, содержатся ли в данной коллекции числа, которые делятся и на 3, и на 5 с помощью stream.
 */

import java.util.List;
import java.util.stream.Collectors;   // Не понимаю, что именно значит от minValue до maxValue.
import java.util.stream.Stream;       // Сгенерировал просто коллекцию рандомных чисел от 1 до 100.

public class Task63 {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.generate(() -> (int) ((Math.random() * 100) + 1))
                .limit(50)
                .collect(Collectors.toList());
        System.out.println("Коллекция рандомных чисел:\n" + numbers);
        boolean bool = numbers.stream()
                .anyMatch(x -> x % 3 == 0 && x % 5 == 0);
        if (bool) {
            List<Integer> finalNumbers = numbers.stream()
                    .filter(x -> x % 3 == 0 && x % 5 == 0)
                    .collect(Collectors.toList());
            System.out.println("Коллекция после сортировки:\n" + finalNumbers);
        }
    }
}
package by.itAcademy.homeworks.lamda;

import by.itAcademy.homeworks.regexp.SimpleReader;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Задание 63
 * 1) Сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue.
 * 2) Определить, содержатся ли в данной коллекции числа, которые делятся и на 3, и на 5 с помощью stream.
*/

public class Task63 {
    public static void main(String[] args) {
        System.out.println("Введите количество значений");
        int numberOfElement = SimpleReader.readInt();
        System.out.println("Введите минимальное значение");
        int minValue = SimpleReader.readInt();
        System.out.println("Введите максимальное значение");
        int maxValue = SimpleReader.readInt();

       long count = Stream.generate(() -> minValue + new Random().nextInt(maxValue-minValue+1))
                .limit(numberOfElement)
                .peek(element -> System.out.print(element + "; "))
                .filter(element -> element%3==0 & element%5==0)
                .count();

        System.out.println("\nКоличество чисел, которые делятся на 3 и на 5");
        System.out.println(count);
    }

}

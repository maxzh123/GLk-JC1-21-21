package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**Задание 63
 * 1. Создать List<Integer> из n элементов от minValue до maxValue
 * 2. С помощью stream найти числа, которые делятся и на 3, и на 5
 */

public class Task63 {
    public static void main(String[] args) {
        int amountOfNumber = 20;
        int minValue = 5;
        int maxValue = 1000;

        List<Integer> list = fillListOFRandomNumbers(amountOfNumber,minValue,maxValue);

        System.out.println("Массив чисел: \n" + Arrays.asList(list));
        Stream<Integer> streamFromList = list.stream().filter((n)-> (n % 3) == 0 && (n % 5) == 0);
        System.out.println("\nЧисла кратные и 3, и 5: " + streamFromList.collect(Collectors.toList()));
    }

    static List fillListOFRandomNumbers (int amountOfNumber, int min, int max){
        List<Integer> listOfNumber = new ArrayList<>();
        int number;
        max -= min;
        do {
            number = (int)(Math.random() * ++max) + min;
            listOfNumber.add(number);
        } while(listOfNumber.size() != amountOfNumber);

        return listOfNumber;
    }
}

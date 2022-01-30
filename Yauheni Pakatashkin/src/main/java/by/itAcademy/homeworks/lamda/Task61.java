package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.stream.Stream;

/**Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
 печатает на экран значения в дюймах;
 переводит значения в сантиметры;
 печатает на экран сумму в сантиментах.
 */
public class Task61 {
    public static void main(String[] args) {
        ArrayList<Double> inches = new ArrayList<Double>();
        for (double i=1;i<=20; i++){
            inches.add(i);
        }
        Stream<Double> stream = inches.stream();
        stream.filter(x -> x%2==0)
                .peek((x)-> System.out.print(x + " inches " ))
                .mapToDouble((x) -> x * 2.54)
                .forEach(System.out::println);
        //Как правильно получить сумму? делал по примеру https://javarush.ru/groups/posts/2203-stream-api





    }
}



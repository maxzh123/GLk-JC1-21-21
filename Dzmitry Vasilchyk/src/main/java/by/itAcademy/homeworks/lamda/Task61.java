package by.itAcademy.homeworks.lamda;

/**Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:

 печатает на экран значения в дюймах;
 переводит значения в сантиметры;
 печатает на экран сумму в сантиментах.**/


import java.util.stream.Stream;

public class Task61 {
    public static void main(String[] args) {
        Double s= Stream.iterate(1, x->x+1)
                .limit(20)
                .filter(intValue->intValue%2==0)
                .peek(intValue-> System.out.print(intValue+" inches="))
                .mapToDouble(doubleValue->doubleValue*2.54)
                .peek(doubleValue-> System.out.println(doubleValue+" centimeters"))
                .reduce(0,Double::sum);
    }
}

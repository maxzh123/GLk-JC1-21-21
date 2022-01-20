package by.itAcademy.homeworks.lamda;

import java.util.Random;
import java.util.stream.Stream;

public class Task62 {
    public static void main(String[] args) {
        long count = Stream.generate(() -> new Random().nextInt(255))
                .limit(100)
                .filter(intValue -> intValue != 0)
                .map(intValue -> (char) intValue.intValue())
                //.peek(System.out::print)
                .peek(Task62::method)
                .count();
        //.reduce(0,(sum,streamItem)->sum+streamItem);
        System.out.println("");
        System.out.println(count);
    }

    static void method(int arg){
        System.out.print(arg);
        System.out.print("; ");
    }
}

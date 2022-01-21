package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Task61 {
    public static void main(String... args) {
        printNumber((x,y)->x+';'+y);
        printNumber((x, y)->{
            return x+';'+y;
        });
        printNumber((String x, String y)->{
                return x+';'+y;
        });
        printNumber(new MyIface(){
            @Override
            public String doSomeStuff(String x, String y) {
                return x+';'+y;
            }
        });
        processNumber(System.out::println,"Эту строку мы выведем");

        processNumber(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        },"Эту строку мы выведем2");
        processNumber((o)->{
                System.out.println(o);
        },"Эту строку мы выведем2");

        processNumber((o)->System.out.println(o),"Эту строку мы выведем3");

    }


    static void printNumber(MyIface holder){
        System.out.println(holder.doSomeStuff("azaza","bbbb"));
    }

    static void processNumber(Consumer obj,String a){
        obj.accept(a);

    }



}

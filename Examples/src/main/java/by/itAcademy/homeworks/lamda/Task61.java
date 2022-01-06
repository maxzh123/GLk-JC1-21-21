package by.itAcademy.homeworks.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task61 {
    public static void main(String[] args) {
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
    }


    static void printNumber(MyIface holder){
        System.out.println(holder.doSomeStuff("azaza","bbbb"));
    }
}

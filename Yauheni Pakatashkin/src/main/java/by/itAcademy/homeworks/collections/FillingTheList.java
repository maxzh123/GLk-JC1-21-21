package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;

public class FillingTheList {
    public static List<Integer> fill(int elements){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<elements; i++){
            list.add((int)(Math.random()*5+1));
        }
        return list;
    }
}

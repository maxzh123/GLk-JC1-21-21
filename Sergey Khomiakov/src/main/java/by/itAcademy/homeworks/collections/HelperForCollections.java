package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;

public class HelperForCollections {

    public static List<Integer> fillTheArrayList (int numberOfElements){   // вспомогательный метод для создания
        List<Integer> list = new ArrayList<>();                            // массива
        for (int i = 0; i < numberOfElements; i++){
            list.add((int)(Math.random()*10+1));
        }
        return list;
    }
}

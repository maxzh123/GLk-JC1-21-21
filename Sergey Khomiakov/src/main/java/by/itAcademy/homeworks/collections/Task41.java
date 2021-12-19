package by.itAcademy.homeworks.collections;

import java.util.Iterator;
import java.util.List;

/** Задание 41
 * 1) Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * 2)  Найти самую высокую оценку с использованием итератора.
 */

public class Task41 {
    public static void main(String[] args) {
        List<Integer> array = HelperForCollections.fillTheArrayList(10);
        System.out.println("Первоначальный список: " + array);
        System.out.println("Максимальное значение: " + getMaxValue(array));

    }

    public static Integer getMaxValue(List<Integer> array){
        int maxValue = array.get(0);
        Iterator <Integer> iterator = array.iterator();
        while (iterator.hasNext()){
            Integer nextValue = iterator.next();
            if(nextValue>maxValue){
                maxValue = nextValue;
            }
        } return maxValue;
    }
}

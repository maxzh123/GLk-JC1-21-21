package by.itAcademy.homeworks.collections;

import java.util.*;

public class OperationsWithArrayList {
    public static List<Integer> getRandomIntList(int size, int maxNumber) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * maxNumber + 1));
        }
        return list;

    }

    public static List<Integer> removeBadNumbers(List<Integer> list, int badNumber) {

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {

            Integer number = iterator.next();
            if (number.compareTo(badNumber) == -1) {
                iterator.remove();
            }
        }

        return list;


    }

    public static Integer maxValue(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        int max = list.get(0);

        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            if(temp > max){
                max = temp;
            }

        } return max;
    }

    public static List<Integer> deleteDuplicate(List<Integer> list) {
        Set<Integer> newList = new LinkedHashSet<>(list);
        list = new ArrayList<>(newList);
        return list;
    }
}

package by.itAcademy.homeworks.collections;


import java.util.List;

public class Task41 {
    public static void main(String[] args) {
        List<Integer> list = OperationsWithArrayList.getRandomIntList(5,10);

        System.out.println("Список \n" +list);

        System.out.println("Максимальное значение в списке - " + OperationsWithArrayList.maxValue(list));


    }
}

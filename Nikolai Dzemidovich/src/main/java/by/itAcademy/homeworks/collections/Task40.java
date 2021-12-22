package by.itAcademy.homeworks.collections;


import java.util.List;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> list = OperationsWithArrayList.getRandomIntList(10,3);

        System.out.println("Обычный список \n" + list);
        System.out.println("Список без дубликатов \n" +OperationsWithArrayList.deleteDuplicate(list));
    }
}

package by.itAcademy.homeworks.collections;


import java.util.List;


public class Task39 {
    public static void main(String[] args) {
        List<Integer> rating = OperationsWithArrayList.getRandomIntList(20, 10);
        System.out.println("Первоначальный список оценок\n" +rating);
        System.out.println("После исключения неудовлетворительных оценок, список следующий:\n" + OperationsWithArrayList.removeBadNumbers(rating, 4));

    }


}

package by.itAcademy.homeworks.collections;


import java.util.List;


public class Task39 {
    public static void main(String[] args) {
        List<Integer> rating = OperationsWithArrayList.getRandomIntList(20, 10);
        System.out.println("Первоначальный список оценок\n" +rating);
        OperationsWithArrayList.removeBadNumbers(rating,4);
        System.out.println("После исключения неудовлетворительных оценок, список следующий:\n" + rating);

    }


}

package by.itAcademy.homeworks.arrays;

/* Создайте переменную для массива из 10 элементов (другим способом).
Заполните его произвольными значениями целочисленного типа и выведите на
экран элементы, стоящие на четных позициях.*/

public class Task19 {
    public static void main(String[] args) {

        int mySecondArray[] = Task18.getHelperToCreateArray(10);
        for (int i = 1; i < mySecondArray.length; i = i + 2) {
            System.out.println(mySecondArray[i]);
        }

    }
}

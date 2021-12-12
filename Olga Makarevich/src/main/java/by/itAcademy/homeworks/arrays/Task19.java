package by.itAcademy.homeworks.arrays;

// Создайте переменную для массива из 10 элементов (другим способом).
// Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на четных позициях.

public class Task19 {
    public static void main(String[] args) {
        int arriveRandom2[];
        arriveRandom2 = new int[10];
        for (int i = 0; i < arriveRandom2.length; i++) {
            arriveRandom2 [i] = (int) (Math.random()*1000+1);
            if (i % 2 == 0) {
                System.out.println(arriveRandom2[i]);
            }
        }
    }
}

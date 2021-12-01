package by.itAcademy.homeworks.arrays;

// Создайте переменную для массива из 10 элементов.
// Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.

public class Task18 {
    public static void main(String[] args) {
        int [] arriveRandomInt10 = new int [10];
        arriveRandomInt10 [0] = (int) (Math.random() * 1000);
        arriveRandomInt10 [1] = (int) (Math.random() * 1000);
        arriveRandomInt10 [2] = (int) (Math.random() * 1000);
        arriveRandomInt10 [3] = (int) (Math.random() * 1000);
        arriveRandomInt10 [4] = (int) (Math.random() * 1000);
        arriveRandomInt10 [5] = (int) (Math.random() * 1000);
        arriveRandomInt10 [6] = (int) (Math.random() * 1000);
        arriveRandomInt10 [7] = (int) (Math.random() * 1000);
        arriveRandomInt10 [8] = (int) (Math.random() * 1000);
        arriveRandomInt10 [9] = (int) (Math.random() * 1000);
        System.out.println(arriveRandomInt10 [8]);
    }

}

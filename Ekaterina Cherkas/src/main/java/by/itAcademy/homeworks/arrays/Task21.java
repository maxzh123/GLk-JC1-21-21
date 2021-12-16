package by.itAcademy.homeworks.arrays;

public class Task21 {
    public static void main(String[] args) {
        int[] array = {9, 3, 8, 7, 4, 8, 10, 8 , 7 , 1};
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            else if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            num = num + array[i];
        }
        int summa = 0 ;
        for (int i = Math.min(indexMin, indexMax)+1;i<Math.max(indexMin, indexMax);i++){
            summa = summa + array[i];
        }
        System.out.println("Сумма элементов между максимальным и минимальным значениями: " + summa);
    }
}

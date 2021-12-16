package by.itAcademy.homeworks.arrays;

public class Task20 {
    public static void main(String[] args) {
        int[] array = {20, 23, 24, 25, 29, 30, 33, 15, 10, 9};
        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}

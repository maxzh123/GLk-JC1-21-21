package by.itAcademy.homeworks.arrays;

public class Task19 {
    public static void main(String[] args) {

        int[] array = Task18.randomArrays(10);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

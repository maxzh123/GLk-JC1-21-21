package by.itAcademy.homeworks.arrays;

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(last());
    }

    public static int[] last(int[] array) {
        int[] a = array;
        for (int i = 0; i < a.length; i = i++) {
            a[i] = i + 2;
        }
        return a;
    }
}

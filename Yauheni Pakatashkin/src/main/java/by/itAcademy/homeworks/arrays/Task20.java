package by.itAcademy.homeworks.arrays;

public class Task20 {
    public static void main(String[] args) {
        int[] array = FillingTheArray.array(10);
        int Max = array[0];
        int index = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > Max) {
                Max = array[i];
                index = i;
            }
        }
        for (int a : array) {
            System.out.print(a+" ");
        }
        System.out.println("");
        System.out.println("Максимальный элемент массива = "+ Max);
        System.out.println("Его индекс = "+ index);
    }

}

package by.itAcademy.homeworks.arrays;

public class Task22 {
    public static void main(String[] args) {
        System.out.println("Первоначальный массив");
        int [] array = {9, 3, 2, 21, 12, 4, 10, 19 , 7 , 1};
        for (int i = 0; i < array.length; i++){
                System.out.println(" " + array[i]);
            }
        for(int i = 0 ; i < array.length/2;i++){
            int n = array[i];
            array[i]= array[array.length - i - 1];
            array[array.length - 1 - i] = n;
        }
        System.out.println("\n");
        System.out.println("Перевернутый массив");
        for (int i = 0 ; i < array.length; i++){
            System.out.println(" " + array[i]);
        }
    }
}

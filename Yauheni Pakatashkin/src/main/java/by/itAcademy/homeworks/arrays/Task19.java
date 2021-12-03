package by.itAcademy.homeworks.arrays;

public class Task19 {
    public static void main(String[] args) {
        int [] array = FillingTheArray.array(10);
        for (int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print(" // вывод массива");
        System.out.println("");
        for (int i =0; i<array.length; i+=2){
            System.out.print(array[i] + " ");
        }
        System.out.print("   // вывод элементов на четных позициях");
    }
}

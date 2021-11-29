package by.itAcademy.homeworks.arrays;

/* Создайте переменную для массива из 10 элементов. Заполните его
 произвольными значениями целочисленного типа и выведите последний элемент
 массива на экран. */

public class Task18 {

    public static void main(String[] args) {
        int [] myArray = getHelperToCreateArray(10);
        System.out.println(myArray[myArray.length-1]);

    }

    public static int[] getHelperToCreateArray(int count){
        int [] array = new int[count];

        for (int i=0; i<array.length;i++){
            array[i] = (int) (Math.random() * 1000 + 1);
        }

        return array;
    }
}

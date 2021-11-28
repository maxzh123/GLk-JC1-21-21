package by.itAcademy.homeworks.arrays;
/**Задание18
 Создать переменную для массива из 10 элементов. Заполнить его произвольными значениями
 целочисленного типа и вывести последний элемент массива на экран.
**/
public class Task18 {
    public static void main(String [] args){
        int marks[] = new int[10];
        int i;
        for(i=0;i<10;i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.println(marks[i]);
        }
        System.out.println("Последний элемент массива равен " + marks[9]);

    }
}


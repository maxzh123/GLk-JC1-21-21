package by.itAcademy.homeworks.arrays;

/**Задание20
 Создать переменную для массива из 10 элементов. Заполнить его произвольными значениями
 целочисленного типа. Найти максимальный элемент и вывести его индекс.
 **/
public class Task20 {
    public static void main(String [] args){
        int size = 10;
        int marks[] = new int[size];
        int i;for(i=0;i<size;i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        i=0;
        int num=-1;
        int maxMark = marks[0];
        for ( i=0; i < 10; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                num=i+1;
            }
        }
        System.out.println("индекс максимального элемента: " + num);
        }
}

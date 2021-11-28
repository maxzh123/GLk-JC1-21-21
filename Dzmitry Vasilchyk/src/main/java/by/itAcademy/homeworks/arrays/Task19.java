package by.itAcademy.homeworks.arrays;
/**Задание19
 Создать переменную для массива из 10 элементов (другим способом). Заполнить его произвольными значениями
 целочисленного типа и вывести на экран элементы, стоящие на четных позициях.
 **/
public class Task19 {
    public static void main(String [] args){
        int size = 10;
        int marks[] = new int[size];
        int i;for(i=0;i<size;i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            if((i+1)%2 == 0){
            System.out.println((i+1) + " элемент:" + marks[i]);
            }
        }
    }
}

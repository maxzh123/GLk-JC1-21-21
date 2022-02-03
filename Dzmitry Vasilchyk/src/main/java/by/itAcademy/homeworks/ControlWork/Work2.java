package by.itAcademy.homeworks.ControlWork;

import java.util.stream.Stream;

/**Сгенерировать массив случайных целых чисел, величина которых, по модулю,
 * не превышает 300 (-300 ... 300). Число элементов массива равно 10. Найти
 * максимальное и минимальное числа в массиве и вывести на экран. Заменить
 * максимальный элемент на минимальный, умноженный на максимальный. **/

public class Work2 {
    static int num=10;
    static int minIndex=0;
    static int maxIndex=0;
    public static void main(String[] args) {
        int [] massiv=new int[num];
        for(int i=0;i<num;i++){
            massiv[i]=(int)(Math.random()*601-300);
            System.out.print(massiv[i]+" ");
        }
        searchMaxMin(massiv);
        changeMaxMin(massiv);
    }
    public static void searchMaxMin (int[] massiv){
        for(int i=0;i<num;i++){
            if (massiv[maxIndex] < massiv[i]) {
                maxIndex = i;
            }
            if (massiv[minIndex] > massiv[i]) {
                minIndex = i;
            }
        }
        System.out.println("\n"+"max="+massiv[maxIndex]+" min="+massiv[minIndex]);
    }
    public static void changeMaxMin (int[] massiv){
        for(int i=0;i<num;i++){
            if (massiv[i]==massiv[maxIndex]){
                massiv[i]=massiv[i]*massiv[minIndex];
            }
            System.out.print(massiv[i]+" ");
        }
    }
}

package by.itAcademy.homeworks.arrays;

/**Задание22
 Создайте переменную для массива из 10 элементов. Заполните его произвольными
 значениями целочисленного типа. Выведите на экран,
 переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).
 **/
public class Task22 {
    public static void main(String [] args){
        int size = 11;
        int marks[] = new int[size];
        for(int i=0;i<size;i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        if (size%2==0){             //три стакана для четных массивов
            for(int i=0;i<size/2;i++){
                int x=marks[i];
                marks[i]=marks[size-1-i];
                marks[size-1-i]=x;
            }
            for(int i=0;i<size;i++){
                System.out.print(marks[i]+" ");
            }
        }
        else                    //три стакана для нечетных массивов
            {
                for(int i=0;i<=size/2;i++){
                    int x=marks[i];
                    marks[i]=marks[size-1-i];
                    marks[size-1-i]=x;
                }
                for(int i=0;i<size;i++){
                    System.out.print(marks[i]+" ");
                }
        }

    }
}



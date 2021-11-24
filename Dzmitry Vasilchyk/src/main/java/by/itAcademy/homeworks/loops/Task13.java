package by.itAcademy.homeworks.loops;

/**Задание13:
 Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 **/

public class Task13 {
    public static void main(String[] args){
        int i=1;
        double f=1;
        do
        {f=f*i;
        System.out.println("Факториал " + i + " равен " + f);
        i++;}
        while (i!=26);
    }
}





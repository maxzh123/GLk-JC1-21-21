package by.itAcademy.homeworks.loops;

/**Задание14:
 Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 **/

public class Task14 {
    public static void main(String[] args){
        long i;
        long f;
        f=0;
        i=7893823445L;
        do
        {f=i%10+f;
          i=i/10;}
        while (i!=0);
        System.out.println("Сумма цифр числа 7893823445 равна " + f);
    }
}


package by.itAcademy.homeworks.loops;
/**Задание15:
 Найти среди чисел от 50 до 70 второе простое число
 **/

public class Task15 {
    public static void main(String[] args ){
        int i,j;
        int p=0;
        for (i=50;i<=70;i++) {
            int k=0;
            for (j=1;j<=i;j++) {
                if (i%j == 0)
                k++;
            }
            if (k==2){
                p++;
                if (p==2)
                System.out.println("второе простое число: " + i);
            }
       }
    }
}

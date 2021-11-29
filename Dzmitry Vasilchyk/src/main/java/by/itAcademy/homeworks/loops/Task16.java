package by.itAcademy.homeworks.loops;

/**Задание16:
 Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”
 **/

public class Task16 {
    public static void main(String[] args ){
        int i;
        int j=7;
        for (i=1;i<=100;i++) {
            if (i%j == 0)
            System.out.println(i+ " Hope!");
        }

    }
}


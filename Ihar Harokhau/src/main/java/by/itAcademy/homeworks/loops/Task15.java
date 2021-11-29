package by.itAcademy.homeworks.loops;

/**
 * Задание 15
 *
 * Найти среди чисел от 50 до 70 второе простое число.
 * Завершить цикл с использованием break.
 *
 */

public class Task15 {
    public static void main(String[] args) {
        int value = 0;
        for (int i = 50 ; i <=70 ; i++){
            int number = 2;
            while (i%number != 0){
                number++;
            }
            if (i==number){
                value++;
                if (value ==2){
                    System.out.println("Второе простое число = " + i);
                    break;
                }
            }
        }
    }
}

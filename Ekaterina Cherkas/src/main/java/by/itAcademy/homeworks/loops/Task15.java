package by.itAcademy.homeworks.loops;

/** Задание 15
 *
 * Найти среди чисел от 50 до 70 второе простое число (число называют простым, если оно делится без остатка только
 * на 1 и себя) и завершить цикл с использованием break.
 */

public class Task15 {
    public static void main(String[] args) {
        int digit = 0;
        for (int i = 50 ; i <=70 ; i++){
            int number = 2;
            while (i%number != 0){
                number++;
            }
            if (i==number){
                digit++;
                if (digit ==2){
                    System.out.println("Второе простое число = " + i);
                    break;
                }
            }
        }
    }
}

package by.itAcademy.homeworks.loops;

/**Задание15
 * Найти среди чисел от 50 до 70 второе простое число (число называют простым,
 * если оно делится без остатка только на 1 и себя) и завершить цикл с
 * использованием break.
 */

public class Task15 {
    public static void main(String[] args){
        int index = 0;

        for (int i = 50; i <= 70; i++){
            int count = 0;
            for (int j = 2; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count < 2) {
                index++;
                if (index == 2){
                    System.out.println("Второе простое число = " + i);
                    break;
                }
            }
        }
    }
}

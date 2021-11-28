package by.itAcademy.homeworks.loops;
/*
> Найти среди чисел от 50 до 70 второе простое число (число называют простым,
> если оно делится без остатка только на 1 и себя) и завершить цикл с
> использованием break.
 */

public class Task15 {
    public static void main(String[] args) {
        int trigger = 0;
        int count = 0;
        for (int i = 50; i < 70; i++){

                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0){
                        count++;
                    }
                }

                if (count == 0) {
                    trigger++;
                } else {count = 0;}

                if (trigger == 2){
                    System.out.println(i);
                    break;
                }
        }
    }
}



package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {                 //помещаю в бесконечный цикл для более удобной проверки
            System.out.println("Введите число");
            int i = Integer.parseInt(reader.readLine());
            if (i % 10 == 1 & i % 100 != 11) {
                System.out.println(i + " рубль");
            } else if (i % 10 == 2 && i % 100 != 12 || i % 10 == 3 && i % 100 != 13 || i % 10 == 4 && i % 100 != 14) {
                System.out.println(i + " рубля");
            } else {
                System.out.println(i + " рублей");
            }

        }
    }
}

package by.itAcademy.homeworks.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/** Задание 45
 * 1) Написать метод, который будет возбуждать исключение и
 * 2) Обработать этоисключение на уровне выше.
 * 3) Результат работы программы вывести на экран.
 */

public class Task45 {
    public static void main(String[] args) {
        try {
            double b = HelperReaderForDouble("Введите число");
            if (b>=0){
                System.out.println("Квадратный корень числа " + b + " равен " + Math.sqrt(b));
            } else throw new MySimpleArithmeticException ("Плохая идея искать квадратный корень отрицательного числа");

        } catch (IOException e) {
            System.out.println("Поздравляю! Вы словили исключение вида IOException.");
        } catch (NumberFormatException e){
            System.out.println("Поздравляю! Вы словили исключение вида NumberFormatException. " +
                    "Возможно вы попытались ввести пустую строку или слова. В следующий раз используйте цифры");
        } catch (MySimpleArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }

    public static double HelperReaderForDouble (String title) throws IOException {
        System.out.println(title);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }
}

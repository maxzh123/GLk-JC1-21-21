package by.itAcademy.homeworks.exceptions;
import java.util.Scanner;

/**Задание 45
 * 1. Написать метод, который будет вызывать исключение
 * 2. Обработать исключиние выше
 * 3. Вывести результат на экран
 */
public class Task45 {
    public static void main(String[] args) throws ScannerException {
        Scanner inputNumber = new Scanner(System.in);
        while (true){
            int number = Integer.parseInt(inputNumber.nextLine());
            if (number < 0){
                throw new ScannerException("Введино число < 0");
            }
        }
    }
}

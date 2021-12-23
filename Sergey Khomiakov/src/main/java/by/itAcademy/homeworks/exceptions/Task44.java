package by.itAcademy.homeworks.exceptions;

import by.itAcademy.homeworks.regexp.SimpleReader;

/** Задание 44
 * 1) Написать собственное исключение от Exception.
 * 2) Сгенерировать код, который будет выбрасывать его и обрабатывать.
 * 3) Результат работы программы вывести наэкран.
 */

public class Task44 {
    public static void main(String[] args) {
        System.out.println("Please, input the first integer number:");
        int a = SimpleReader.readInt();
        System.out.println("Please, input the second integer number:");
        int b = SimpleReader.readInt();

        try{
            System.out.println("The result is " + divideTheNumber(a,b));
        } catch (MySimpleArithmeticException ex){
            System.out.println(ex.getMessage());
        }

    }

    public static int divideTheNumber(int a, int b) throws MySimpleArithmeticException {
        if (b==0){
            throw new MySimpleArithmeticException("Divide by zero is not allowed! Check your second number");
        }
        return a/b;
    }

}

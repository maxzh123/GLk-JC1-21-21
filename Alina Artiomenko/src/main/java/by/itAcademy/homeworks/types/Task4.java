package by.itAcademy.homeworks.types;

/** Задание 04
* 1. принемаем на вход firstNum и secondNum - тип int
* 2. находим сумму чисел firsNum и secondNum
* 3. находим произведение чисел firsNum и secondNum
* 4. результаты суммирования и произведения складываем
* 5. вывод результата в консоль
**/

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Введите первое целое число: ");
    int firstNum = input.nextInt();
    System.out.println("Введите второе целое число: ");
    int secondNum = input.nextInt();
    
    int sum = firstNum + secondNum;
    System.out.println("Сумма введённых чисел = " + sum);
    
    int mult = firstNum * secondNum;
    System.out.println("Произведение введённых чисел = " + mult);
    
    int finelResult = sum + mult;
    System.out.print("Результат сложения суммы двух чисел с их произведением = " + finelResult);
  }
}

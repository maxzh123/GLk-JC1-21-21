package by.itAcademy.homeworks.types;

/** Задание 04
* 1. находим сумму чисел firsNum и secondNum (числа - int)
* 2. находим произведение чисел firsNum и secondNum
* 3. результаты суммирования и произведения складываем
**/

public class Task4 {

  public static int resultSumAndMultOfTwoNumbers(int firstNumber, int secondNumber){
    int result = (firstNumber + secondNumber) + (firstNumber * secondNumber);
    return result;
  }
}

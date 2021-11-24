package by.itAcademy.homeworks.types;
//Написать метод, который принимает на вход два целых числа, делает их суммирование и складывает результат с произведением двух этих чисел, и возвращает полученный результат из метода. Передать на вход в метод любые два числа. Вывести полученный результат работы метода на экран

public class Task4 {

    public static void main(String[] args) {

        int firstNumber = MyReadHelper.readInt("первое число");
        int secondNumber = MyReadHelper.readInt("второе число");

        System.out.println((firstNumber + secondNumber) + (firstNumber * secondNumber));
    }
}


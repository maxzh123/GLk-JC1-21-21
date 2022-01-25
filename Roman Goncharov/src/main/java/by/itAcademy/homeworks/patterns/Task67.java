package by.itAcademy.homeworks.patterns;

/**
 * Задание 67
 * Создайте простейший сервис с методом, который выводит на экран текущую дату.
 * Сделайте его Singleton и используйте в основном теле программы.
 */

public class Task67 {
    public static void main(String[] args) {
        DateSingleton myDate = DateSingleton.getInstance();
        myDate.printCurrentDate();
    }
}
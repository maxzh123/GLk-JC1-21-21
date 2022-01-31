package by.itAcademy.homeworks.patterns;

/** Задание 67
 * 1) Создать простейший сервис с методом, который выводит на экран текущуюдату.
 * 2) Сделайте его Singleton и используйте в основном телепрограммы.
  */


public class Task67 {
    public static void main(String[] args) {
        MySingletoneDate msd = MySingletoneDate.getInstance();
        System.out.println("Текущая дата: " + msd.showCurrentDate());
    }
}

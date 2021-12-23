package by.itAcademy.homeworks.operators;

/** Задание 11
 * На входе мы имеем порядковый номер дня недели, и, в зависимости от выбора, нам выводится, что запланировано на данный день.
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели:");
        int number = console.nextInt();
        schedule(number);
    }

    public static void schedule (int number) {
        switch (number) {
            case (1):
                System.out.println("Понедельник, 18.30: Курсы IT");
                break;
            case (2):
                System.out.println("Вторник, 13.00: Тренировка");
                break;
            case (3):
                System.out.println("Среда, 15.00: Прием у врача-терапевта");
                break;
            case (4):
                System.out.println("Четверг, 19.30: Курсы английского языка");
                break;
            case (5):
                System.out.println("Пятница, 16.00: Тренировка");
                break;
            case (6):
                System.out.println("Суббота, 18.15: Сеанс в кинотеатре");
                break;
            case (7):
                System.out.println("Воскресенье, 13.30: Встреча с друзьями");
                break;
            default:
                System.out.println("Дня недели с таким порядковым номером не существует");
                break;
        }
    }
}

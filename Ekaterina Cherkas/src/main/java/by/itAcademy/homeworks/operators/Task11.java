package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** Задание 11
 *
 * Написать метод, который выводит расписание на неделю. Задать на вход в метод порядковый номер дня
 * недели и отобразить на экране то, что запланировано на этот день.
 */


public class Task11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();
        int i = Integer.parseInt(k);
        if (i == 1) {
            System.out.println("Понедельник - танцы и растяжка");
        }
        else if (i == 2) {
            System.out.println("Вторник - сдать презентацию");
        }
        else if (i == 3) {
            System.out.println("Среда - стоматолог");
        }
        else if (i == 4) {
            System.out.println("Четверг - фитнес(утро),бассейн(вечер)");
        }
        else if (i == 5) {
            System.out.println("Пятница - зайти к бабуле и дедуле после занятий");
        }
        else if (i == 6) {
            System.out.println("Суббота - поход в кино");
        }
        else if (i == 7) {
            System.out.println("Воскресенье - встреча с друзьями в баре");
        } else
            System.out.println("Дни закончились");
    }
}


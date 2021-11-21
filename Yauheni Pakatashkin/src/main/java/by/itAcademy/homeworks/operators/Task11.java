package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядковый номер дня недели");
        while (true) {
            int i = Integer.parseInt(reader.readLine());
            if (i > 0 & i < 8) {
                printTimetable(i);
                reader.close();
                break;
            } else{
                System.out.println("Такого дня недели не существует. Введите еще число еще раз");
            }
        }
    }
    private static void printTimetable(int a) {
        switch (a) {
            case 1:
                System.out.println("понедельник");
                //набор действий для этого дня
                break;
            case 2:
                System.out.println("вторник");
                //набор действий для этого дня
                break;
            case 3:
                System.out.println("среда");
                //набор действий для этого дня
                break;
            case 4:
                System.out.println("четверг");
                //набор действий для этого дня
                break;
            case 5:
                System.out.println("пятница");
                //набор действий для этого дня
                break;
            case 6:
                System.out.println("суббота");
                //набор действий для этого дня
                break;
            case 7:
                System.out.println("воскресенье");
                //набор действий для этого дня
                break;
        }

    }

}

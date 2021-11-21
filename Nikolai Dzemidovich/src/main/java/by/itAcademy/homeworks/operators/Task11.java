package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Какой день недели Вас интересует ?");
        int weekNubmer = scr.nextInt();
        switch (weekNubmer){
            case 1:
                System.out.println("Понедельник");
                System.out.println("Встреча в 15 30");
                break;
            case 2:
                System.out.println("Вторник");
                System.out.println("Ничего не запланированно");
                break;
            case 3:
                System.out.println("Среда");
                System.out.println("Курсы в 19 30");
                break;
            case 4:
                System.out.println("Четверг");
                System.out.println("Тренировка в 18 00");
                break;
            case 5:
                System.out.println("Пятница");
                System.out.println("Встреча в баре");
                break;
            case 6:
                System.out.println("Суббота");
                System.out.println("Встерча с родственниками");
                break;
            case 7:
                System.out.println("Воскресенье");
                System.out.println("День рождения у Евгения");
                break;
            default:
                System.out.println("День недели не найден");
                break;


        }
    }
}

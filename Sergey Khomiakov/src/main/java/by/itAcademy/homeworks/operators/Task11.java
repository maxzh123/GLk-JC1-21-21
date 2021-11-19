package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
> Написать метод, который выводит расписание на неделю. Задать на вход в
> метод порядковый номер дня недели и отобразить на экране то, что запланировано
> на этот день.
 */

public class Task11 {
    static int a;

    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Chose day of week and write his number. You can use only whole number");
            a = Integer.parseInt(reader.readLine());
            getShedulle(a);
        }
        catch (Exception ex){
            System.out.println("You have to write only whole number!");
        }

    }

    private static void getShedulle(int dayZ){
        switch(dayZ) {
            case 1:
                System.out.println("Today is Monday. You have to do your homework and go to the course");
                break;
            case 2:
                System.out.println("Today is Tuesday. You have to do your homework and go to another course");
                break;
            case 3:
                System.out.println("Today is Wednesday. You can relax today. It`s no bad for you! Keep the smile :) ");
                break;
            case 4:
                System.out.println("Today is Thursday. You have to do your homework and go to another course ");
                break;
            case 5:
                System.out.println("Today is Friday. You have to do your homework and can go for a walk ");
                break;
            case 6:
                System.out.println("Today is Saturday. Just relax, because you are the BEST ");
                break;
            case 7:
                System.out.println("Today is Sunday. Let`s go to the cinema!");
                break;
            default:
                System.out.println("What`s the number?! Are you drunk? You need only choose numbers from 1 until 8!");
                break;

        }


    }

}

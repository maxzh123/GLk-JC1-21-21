package by.itAcademy.homeworks.enums;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task36 {
    public static void main(String[] args) throws  Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сезон");
        String s = reader.readLine();
        Seasons season = Seasons.valueOf(s.toUpperCase());
        System.out.println("Next season is " + Seasons.nextSeason(season));
    }
}

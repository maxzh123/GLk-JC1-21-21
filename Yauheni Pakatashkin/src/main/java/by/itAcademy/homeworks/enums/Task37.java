package by.itAcademy.homeworks.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task37 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сезон");
        String s = reader.readLine();
        Seasons season = Seasons.valueOf(s.toUpperCase());
        System.out.println("Количество дней в сезоне " + Seasons.showCount(season));
    }
}

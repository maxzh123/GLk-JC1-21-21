package by.itAcademy.homeworks.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Написать метод, который в зависимости от сезона,
 выводит на экран сумму дней в этом сезоне.
 Входной параметр ввести с клавиатуры.**/
enum SeasonDay {
    Winter(90),
    Spring(91),
    Summer(92),
    Autumn(91);
    private int countOfDays;
    SeasonDay(int countOfDays) {
        this.countOfDays = countOfDays;
    }
     int getCountOfDays() {
        return countOfDays;
    }
}
public class Task37 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите название сезона: Winter, Spring, Summer, Autumn");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String season= reader.readLine();
        SeasonDay s = SeasonDay.valueOf(season);
        System.out.println("В сезоне "+s+" "+s.getCountOfDays()+" дней");
    }
}

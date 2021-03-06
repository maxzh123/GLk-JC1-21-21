package by.itAcademy.homeworks.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
 Входной параметр ввести с клавиатуры.
 **/

enum SeasonDay {
    Winter(90),
    Spring(91),
    Summer(92),
    Autumn(91);
    private final int countOfDays;
    SeasonDay(int countOfDays) {
        this.countOfDays = countOfDays;
    }
    int getCountOfDays() {
        return countOfDays;
    }
}
public class Task37 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите название сезона: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String season = reader.readLine();
        SeasonDay day = SeasonDay.valueOf(season);
        System.out.println("В сезоне "+day+" "+day.getCountOfDays()+" день");
    }
}

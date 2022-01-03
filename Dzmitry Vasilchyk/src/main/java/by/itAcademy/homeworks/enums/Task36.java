package by.itAcademy.homeworks.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Написать метод, который выводит следующий сезон от заданного во входном
 * параметре. Входной параметр ввести с клавиатуры.**/


enum NextSeason{
    Winter,Spring,Summer,Autumn;
    static String getNextSeason(String season) {
        switch (season){
            case "Winter":
                System.out.println("Следующий сезон-Весна");
                break;
            case "Spring":
                System.out.println("Следующий сезон-Лето");
                break;
            case "Summer":
                System.out.println("Следующий сезон-Осень");
                break;
            case "Autumn":
                System.out.println("Следующий сезон-Зима");
                break;
            default:
                System.out.println("Неправильно введено название сезона");
                break;
        }
        return season;
    }
}
public class Task36 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите название сезона");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String season= reader.readLine();
        NextSeason.getNextSeason(season);
    }
}

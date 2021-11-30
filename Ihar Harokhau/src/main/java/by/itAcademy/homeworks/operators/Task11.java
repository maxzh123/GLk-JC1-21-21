package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int date = Integer.parseInt(reader.readLine());

        switch (date){
            case 1:
                System.out.println("Занятие в it-Academy.");
                break;
            case 2:
                System.out.println("Почитать теорию на следующую лекцию.");
                break;
            case 3:
                System.out.println("Выполнение домашней работы.");
                break;
            case 4:
                System.out.println("Буллинг от Максима :)");
                break;
            case 5:
                System.out.println("ПЯТНИЧКА!! Можно и почилить.");
                break;
            case 6:
                System.out.println("Опять делать домашку..");
                break;
            case 7:
                System.out.println("Можно расслабиться, ведь ты программист." +
                        "\nПрограммисты люди ленивые." + '©' + "\n  Дробышевский, Железный");
                break;

        }
    }
}

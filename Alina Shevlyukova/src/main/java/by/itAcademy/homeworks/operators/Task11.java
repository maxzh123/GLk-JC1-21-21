package by.itAcademy.homeworks.operators;

import javax.swing.*;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели: ");
        int num =input.nextInt();

        if (num<=7) {
            switch (num) {
                case 1:
                    System.out.println("Отдых после выходных");
                    break;
                case 2:
                    System.out.println("Подготовка к рабочему дню");
                    break;
                case 3:
                    System.out.println("Рабочий день");
                    break;
                case 4:
                    System.out.println("Отдых после рабочего дня");
                    break;
                case 5:
                    System.out.println("Пятница-развратница");
                    break;
                case 6:
                    System.out.println("Отсыпной");
                    break;
                case 7:
                    System.out.println("Выходной");
                    break;
                default:
                    System.out.println("У вас в неделе больше 7 дней???");
            }}else {
            System.out.println("У тебя большу 7 дней в неделе?????");
        }
        }
    }


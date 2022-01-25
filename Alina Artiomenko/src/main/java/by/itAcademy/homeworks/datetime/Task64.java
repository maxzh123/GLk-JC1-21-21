package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**Задание 64
 * 1. Ввести с клавиатуры номер месяца текущего года
 * 2. Вывести на экран все его даты в формате d::MMM::uuuu
 */

public class Task64 {
    public static void main(String[] args) {
        int numberOfMonth = setMonth();
        final int YEAR = 2022;
        printAllDayInMonth(YEAR, numberOfMonth);
    }

    private static int setMonth(){
        int numberOfMonth = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Введите номер месяца: ");
            numberOfMonth = input.nextInt();
        } while (numberOfMonth < 1 || numberOfMonth > 12);
        return numberOfMonth;
    }

    private static void printAllDayInMonth(int year, int month){
        LocalDate date = LocalDate.of(year,month,1);
        LocalDate lastDateOfMonth = LocalDate.of(year, month, date.lengthOfMonth());

        do{
            System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
            date = date.plusDays(1);
        } while(!date.isAfter(lastDateOfMonth));
    }
}

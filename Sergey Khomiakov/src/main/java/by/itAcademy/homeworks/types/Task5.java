package by.itAcademy.homeworks.types;
/*
Задать промежуток времени в секундах в виде переменной. Следует вывести
> его на экран в виде часов минут и секунд, суток и недель.
 */

public class Task5 {
    public static void main(String[] args) {
        int weeks, days,hours, minutes, seconds;
        int weekstmp, daystmp,hourstmp, minutestmp;

        int time = 1433976;

        weeks = time/(7 * 24 * 3600); // получаем целое число недель в заданном промежутке времени
        weekstmp = weeks * 7 * 24 * 3600; // промежуточная переменная для облегчения восприятия расчетов

        days = (time - weekstmp) /(24 * 3600); // получаем целое дней в оставшемся промежутке времени
        daystmp = days * 24 * 3600; //промежуточная переменная для облегчения восприятия расчетов

        hours = (time - weekstmp - daystmp) / 3600;  // получаем целое число часов в оставшемся промежутке времени
        hourstmp = hours * 3600; //промежуточная переменная для облегчения восприятия расчетов

        minutes = (time - weekstmp - daystmp - hourstmp) / 60; // получаем целое число минут в оставшемся промежутке времени
        minutestmp = minutes * 60; //промежуточная переменная для облегчения восприятия расчетов

        seconds = time - weekstmp - daystmp - hourstmp - minutestmp; // получаем целое число секунд в оставшемся промежутке времени

        System.out.println("В " + time + " секундах(е) находится:");
        System.out.println(weeks + "нед " + days + "дн " + hours + "ч " + minutes + "мин " + seconds + "сек");
    }
}

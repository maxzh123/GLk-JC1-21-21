package by.itAcademy.homeworks.types;

public class Task5 {
  public static void main(String[] args) {
        
        int time = 758525;

        int week = time / (7 * 24 * 3600);
        int weekSec = week * 7 * 24 * 3600;

        int day = (time - weekSec) / (24 * 3600);
        int daySec = day * 24 * 3600;

        int hour = (time - weekSec - daySec) / 3600;
        int hourSec = hour * 3600;

        int min = (time - hourSec - weekSec - daySec) / 60;

        int sec = time % 60;

        System.out.println(week + " Недель, " + day + " Дней, " + hour + " Часов," + min + " Минут," + sec + " Секунд");


    }
}

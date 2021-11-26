package by.itAcademy.homeworks.types;

// Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран в виде часов минут и секунд, суток и недель.

public class Task5 {
    public static void main(String[] args) {
        int sec = 6582;
        int secPrint = sec % 60;
        int minute = (sec - secPrint) / 60;
        int minutePrint = minute % 60;
        int hour = (minute - minutePrint) / 60;
        System.out.println(hour + " hour " + minutePrint + " minute " + secPrint + " second ");
    }
}

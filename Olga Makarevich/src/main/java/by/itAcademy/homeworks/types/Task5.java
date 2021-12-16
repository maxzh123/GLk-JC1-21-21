package by.itAcademy.homeworks.types;

// Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран в виде часов минут и секунд, суток и недель.

//public class Task5 {
//    public static void main(String[] args) {
//        int sec = 6582;
//        int secPrint = sec % 60;
//        int minute = (sec - secPrint) / 60;
//        int minutePrint = minute % 60;
//        int hour = (minute - minutePrint) / 60;
//        System.out.println(hour + " hour " + minutePrint + " minute " + secPrint + " second ");
//    }
//}

// Second try

public class Task5 {

    public static void main(String[] args) {
        int sec = (int) (Math.random() * 100000);
        System.out.println(sec);
        System.out.println(bringTime(sec));
    }

        static String bringTime (int second) {
            int secondCount = second % 60;
            int minute = (second - secondCount) / 60;
            int minuteCount = minute % 60;
            int hour = (minute - minuteCount) / 60;
            int hourCount = hour % 24;
            int day = (hour - hourCount) / 30;
            int dayCount = day / 30;
            int week = (day - dayCount) / 7;
            int weekCount = week / 7;
            String s = weekCount + " week " + dayCount + " days " + hourCount + " hours " + minuteCount + " minute " + secondCount + " second";
            return s;
        }
    }

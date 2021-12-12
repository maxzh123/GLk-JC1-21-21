package by.itAcademy.homeworks.objects;

public class TimeInterval {
    int hour;
    int minute;
    int second;

    public static int numberOfSeconds (int hour, int minute, int second) {
        minute = minute * 60;
        hour = hour * 3600;
        int secondSum = hour + minute + second;
        return secondSum;
    }

    public static boolean comparisonTimes (int hour, int minute, int second) { // НЕ РАБОТАЕТ
        TimeInterval TimeRandom = new TimeInterval();
        TimeRandom.hour = (int) (Math.random() * 24 + 1);
        TimeRandom.minute = (int) (Math.random() * 60 + 1);
        TimeRandom.second =(int) (Math.random() * 60 + 1);
        if (TimeRandom.hour == hour) {
            if (minute == TimeRandom.minute) {
                if (second == TimeRandom.second) {
                    System.out.println("Time 1 = Time 2");
                }
            }
        }
        return true;
    }
}

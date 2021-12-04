package by.itAcademy.homeworks.objects;

public class TimeInterval {
    private int hour;
    private int min;
    private int sec;

    public TimeInterval(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public TimeInterval(int sec) {
        this.hour = sec / 3600;
        this.min = sec % 3600 / 60;
        this.sec = sec % 3600 % 60;
    }

    public int goToSeconds() {
        return hour * 3600 + min * 60 + sec;
    }

    public int compareTo(TimeInterval object) {
        Integer a = this.goToSeconds();
        return a.compareTo(object.goToSeconds());
    }

    public void dataPrint() {
        System.out.println(hour + " hours " + min + " minutes " + sec + " seconds");
        System.out.println("Полное количество секунд в объекте:" + goToSeconds());
    }
}

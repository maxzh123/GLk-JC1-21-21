package by.itAcademy.homeworks.objects;

public class Task24 {
    public static void main(String[] args) {
        TimeInterval timeInt1 = new TimeInterval(14, 23, 44);
        TimeInterval timeInt2 = new TimeInterval(51825);
        timeInt1.dataPrint();
        timeInt2.dataPrint();
        System.out.println("Результат сравнения двух объектов методом compareTo: " + timeInt1.compareTo(timeInt2));
    }
}

class TimeInterval {
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
package by.itAcademy.homeworks.objects;

public class Task24 {
    int hour;
    int min;
    int sec;
    int seconds;

    public static void main(String[] args) {
        Task24 timeInterval = new Task24(20,51,33);
        Task24 timeSeconds = new Task24(73000);
        System.out.println(timeInterval.goToSeconds(timeInterval.hour, timeInterval.min, timeInterval.sec));
    }

    public Task24(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Task24(int seconds) {
        this.seconds = seconds;
    }

    public int goToSeconds (int hour, int min, int sec) {
        int seconds = hour * 3600 + min * 60 + sec;
        return seconds;
    }
}
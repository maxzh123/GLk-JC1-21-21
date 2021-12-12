package by.itAcademy.homeworks.objects;

public class TimeInterval {
    private int hour, minute, seconds;

    public TimeInterval(int seconds) {
        this.seconds = seconds;
    }

    public TimeInterval(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getQuantityOfSeconds() {
        return getHour() * 3600 + getMinute() * 60 + getSeconds();
    }

    public boolean compare(TimeInterval b) {
        return (this.getQuantityOfSeconds() == b.getQuantityOfSeconds());
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0)
            this.minute = minute;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0)
            this.seconds = seconds;
    }

    public void setHour(int hour) {
        if (hour >= 0)
            this.hour = hour;
    }
}

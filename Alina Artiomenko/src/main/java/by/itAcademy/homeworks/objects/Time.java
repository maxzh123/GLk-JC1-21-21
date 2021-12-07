package by.itAcademy.homeworks.objects;

public class Time implements Comparable<Time>{
    int seconds;
    int minutes;
    int hours;

    //конструктор (получает секунды, минуты, часы)
    public Time (int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    //конструктор (получает время в секундах)
    public Time (int seconds){
        this.seconds = seconds % 60;
        minutes = ((seconds - this.seconds) / 60) % 60;
        hours = (seconds - minutes * 60) / 3600;
    }

    //полное кол-во секунд
    public int getNumberOfSecond(){
        return seconds + minutes * 60 + hours * 3600;
    }

    //вывод времени
    public String printTime(){
        String message = "";
        return message = String.format("%02d" + " часов " + "%02d" + " минут "  + "%02d" + " секунд = " + getNumberOfSecond() + " секунд",
                hours, minutes, seconds);
    }

    @Override
    public int compareTo(Time t){
        Integer a = getNumberOfSecond();
        return a.compareTo(t.getNumberOfSecond());
    }
}

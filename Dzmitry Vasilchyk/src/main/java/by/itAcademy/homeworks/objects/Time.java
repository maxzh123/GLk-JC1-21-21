package by.itAcademy.homeworks.objects;

public class Time {
    int seconds;
    int minutes;
    int hours;
    Time(int seconds) {
        this.seconds = seconds % 60;
        minutes = ((seconds - this.seconds) / 60) % 60;
        hours = (seconds - minutes * 60) / 3600;
    }
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    int getTime(){
        return hours*3600+minutes*60+seconds;
    }
    int compare(Time b){
        Integer a=getTime();
        return a.compareTo(b.getTime());
    }
}



package by.itAcademy.homeworks.objects;

public class TimeLength implements Comparable<TimeLength> {

    private int hours;
    private int minutes;
    private int seconds;

    public  TimeLength (int hours,int minutes,int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public TimeLength(int seconds){
    this.hours = seconds/3600;
    this.minutes = (seconds%3600) / 60;
    this.seconds = (seconds%3600) % 60;
    }
    public int getNumberOfSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
        }
        public int compareTo(by.itAcademy.homeworks.objects.TimeLength object) {
        Integer a = this.getNumberOfSeconds();
        return a.compareTo(object.getNumberOfSeconds());
    }
    public void timePrint(){
        System.out.println("Time " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
        System.out.println("Total seconds : " + getNumberOfSeconds());
    }
}
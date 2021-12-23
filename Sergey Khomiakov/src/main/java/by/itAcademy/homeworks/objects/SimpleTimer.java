package by.itAcademy.homeworks.objects;

/** Создать класс описывающие промежуток времени. Сам промежуток в классе
должен задаваться тремя свойствами: секундами, минутами, часами. Сделать
методы для получения полного количества секунд в объекте, сравнения двух
объектов (метод должен работать аналогично compareTo в строках). Создать два
конструктора:
- получающий общее количество секунд
- получающий часы, минуты и секунды по отдельности.
Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class SimpleTimer implements Comparable<SimpleTimer> {
    private int seconds;
    private int minutes;
    private int hours;

    public SimpleTimer(int seconds){
        this.hours = seconds/3600;
        this.minutes = seconds%3600/60;
        this.seconds = seconds%3600%60;
    }

    public SimpleTimer(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getNumberOfSeconds(){
           return hours * 3600 + minutes * 60 + seconds;
    }


    public int compareTo(SimpleTimer object) {
        Integer a = this.getNumberOfSeconds();
        return a.compareTo(object.getNumberOfSeconds());
    }
    @Override
    public String toString(){
        return "hours = " + hours + " minutes = " + minutes + " seconds = " + seconds;
    }

    public static void print(SimpleTimer time){
        System.out.println(time.toString());
    }

}

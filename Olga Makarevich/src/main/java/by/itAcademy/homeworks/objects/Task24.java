package by.itAcademy.homeworks.objects;

// Создать класс описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
// Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (метод должен работать аналогично compareTo в строках). Создать два конструктора:
//
//получающий общее количество секунд
//получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.


public class Task24 { // Не понимаю, как работает метод compareTo; метод comparisonTimes не работает
    public static void main(String[] args) {
        TimeInterval TimePeriod = new TimeInterval();
        TimePeriod.hour = (int) (Math.random() * 24 + 1);
        TimePeriod.minute = (int) (Math.random() * 60 + 1);
        TimePeriod.second =(int) (Math.random() * 60 + 1);
        System.out.println(TimeInterval.numberOfSeconds(TimePeriod.hour, TimePeriod.minute, TimePeriod.second));
        System.out.println(TimePeriod.hour + " hour " + TimePeriod.minute + " minute " + TimePeriod.second + " second");
        System.out.println(TimeInterval.comparisonTimes(TimePeriod.hour, TimePeriod.minute, TimePeriod.second));
    }

}

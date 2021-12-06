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

public class Task24 {
    public static void main(String[] args) {
        SimpleTimer newTime = new SimpleTimer(1600);
        SimpleTimer newTime1 = new SimpleTimer(1,0,1);
        System.out.println(newTime.compareTo(newTime1));
        SimpleTimer.print(newTime);
        SimpleTimer.print(newTime1);
    }

}

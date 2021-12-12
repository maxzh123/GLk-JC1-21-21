package by.itAcademy.homeworks.objects;

import by.itAcademy.homeworks.types.Task5;

/**Создать класс описывающие промежуток времени. Сам промежуток в классе должен
 *  задаваться тремя свойствами: секундами, минутами, часами. Сделать методы
 *  для получения полного количества секунд в объекте, сравнения двух объектов
 *  (метод должен работать аналогично compareTo в строках). Создать два конструктора:
 * получающий общее количество секунд
 * получающий часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
 **/
public class Task24 {
    public static void main(String[] args) {
        Time x1 = new Time(640);
        Time x2 = new Time(0,9,40);
        System.out.println(x1.getTime()+" seconds - "+x1.hours+" hours "+x1.minutes+
                " minutes "+x1.seconds+" seconds");
        System.out.println(x2.hours+" hours "+x2.minutes+" minutes "+x2.seconds+
                " seconds - "+x2.getTime()+" seconds");
        System.out.println(x1.compare(x2));
    }
}



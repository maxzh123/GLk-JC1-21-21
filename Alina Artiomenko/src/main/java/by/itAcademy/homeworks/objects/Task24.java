package by.itAcademy.homeworks.objects;

/**Задание 24
 * 1. Создать класс описывающий промежуток времени
 * 2. Промежуток времени задаётся - секунды, минуты, часы
 * 3. Создать 2 конструтора:
 *      - получающий общее количество секунд
 *      - получающий часы, минуты и секунды по отдельности
 * 4. Создать методы:
 *      - получать полное кол-во секунд в объекте
 *      - сравнения двух объектов (метод должен работать аналогично compareTo в строках)
 *      - вывод данных
 */

public class Task24 {
    public static void main(String[] args){
        Time t01 = new Time(1, 1, 1);
        Time t02 = new Time(365);

        System.out.println(t01.printTime());
        System.out.println(t02.printTime());
        System.out.println(t02.compareTo(t01));
    }
}

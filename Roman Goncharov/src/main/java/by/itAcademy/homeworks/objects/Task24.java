package by.itAcademy.homeworks.objects;

/**
 Создать класс, описывающий промежуток времени. Сделать методы для получения полного кол-ва секунд в объекте,
 сравнения двух объектов. Создать два конструктора:
 1.получающий общее кол-во секунд.
 2.получающий часы,минуты,секунды по отдельности.
 */

public class Task24 {
    public static void main(String[] args) {
        TimeInterval timeInt1 = new TimeInterval(14, 23, 44);
        TimeInterval timeInt2 = new TimeInterval(51825);
        timeInt1.dataPrint();
        timeInt2.dataPrint();
        System.out.println("Результат сравнения двух объектов методом compareTo: " + timeInt1.compareTo(timeInt2));
    }
}
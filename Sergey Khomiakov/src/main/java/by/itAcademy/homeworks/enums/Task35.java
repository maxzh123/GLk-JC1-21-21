package by.itAcademy.homeworks.enums;

/** Создать enum, который описывает сезоны года. Добавить поле description в
 * этот enum. Добавить поле countOfDays в этот enum. Вывести на экран все константы
 * сезоны года.
 */

public class Task35 {
    public static void main(String[] args) {
            for (SeasonsOfTheYear seasons: SeasonsOfTheYear.values()){
                System.out.println(seasons + " это сезон, когда... " + seasons.description + " и в котором "
                        + seasons.countOfDays + " дня(день)");
            }
    }
}

package by.itAcademy.homeworks.enums;

/**Задание 35
 * 1. Создать enum, который описывает сезоны года
 * 2. Добавить поле description в enum
 * 3. Добавить поле countOfDays в enum
 * 4. Вывести на экран все константы сезоны года
 */
public class Task35 {
    public static void main(String[] args){
        for (SeasonsOfTheYear seas : SeasonsOfTheYear.values()){
            System.out.println(seas + " - " + seas.description + ". \n\tКол-во дней в сезоне = " + seas.countOfDays);
        }
    }
}

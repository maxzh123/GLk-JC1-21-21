package by.itAcademy.homeworks.enums;
/**Создать enum, который описывает сезоны года. Добавить поле description в этот enum.
 Добавить поле countOfDays в этот enum. Вывести на экран все константы сезоны года.
 **/
enum Seasons{
    Winter(90,"холод"),
    Spring(91,"тепло"),
    Summer(92,"жара"),
    Autumn(91,"пасмурно");
    private final int countOfDays;
    private final String description;
    Seasons(int countOfDays,String description){
        this.countOfDays=countOfDays;
        this.description=description;
}
    int getCountOfDays(){

        return countOfDays;
    }
    String getDescription()
    {
        return description;
    }
    public static void displayingInfoAboutSeason(Seasons season) {
        System.out.println(season);
        System.out.println(season.getDescription());
        System.out.println(season.getCountOfDays() + " days");
    }
public static class Task35 {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            Seasons.displayingInfoAboutSeason(season);
        }
    }
    }
}
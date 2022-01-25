package by.itAcademy.homeworks.enums;

/**Создать enum, который описывает сезоны года. Добавить поле description в этот enum.
 Добавить поле countOfDays в этот enum. Вывести на экран все константы сезоны года.
 **/

enum Season{
    Winter(90,"холод"),
    Spring(91,"тепло"),
    Summer(92,"жара"),
    Autumn(91,"прохлада");
    private final int countOfDays;
    private final String description;
    Season(int countOfDays,String description){
        this.countOfDays=countOfDays;
        this.description=description;
    }
    int getCountOfDays(){
        return countOfDays;
    }
    String getDescription(){
        return description;
    }
}
public class Task35 {
    public static void main(String[] args){
        for(Season t :Season.values())
            System.out.println(t+":"+ t.getCountOfDays() + t.getDescription());
    }
}
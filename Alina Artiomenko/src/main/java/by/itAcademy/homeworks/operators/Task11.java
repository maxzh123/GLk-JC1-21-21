package by.itAcademy.homeworks.operators;

/**Задание 11
 * 1. вывести расписание в заданный день недели (число)
 * */

public class Task11 {
    public static void main(String[] args){
        int numberOfDay = 3;
        System.out.println(planOfDay(numberOfDay));
    }

    public static String planOfDay(int day){
        String plan = "";
        switch (day){
            case 1:
                plan = "ПОНЕДЕЛЬНИК:\n\tВыпить чашку кофе утром в понедельник";
                break;
            case 2:
                plan = "ВТОРНИК:\n\tВыпить чашку кофе утром во вторник";
                break;
            case 3:
                plan = "СРЕДА:\n\tВыпить чашку кофе утром в среду";
                break;
            case 4:
                plan = "ЧЕТВЕРГ:\n\tВыпить чашку кофе утром в четверг";
                break;
            case 5:
                plan = "ПЯТНИЦА:\n\tВыпить чашку кофе утром в четверг";
                break;
            case 6:
                plan = "СУББОТА:\n\tСпать максимально долго в субботу";
                break;
            case 7:
                plan = "ВОСКРЕСЕНЬЕ:\n\tСпать максимально долго в воскресенье";
                break;
            default:
                plan = "Такого дня недели не существует!";
        }
        return plan;
    }
}

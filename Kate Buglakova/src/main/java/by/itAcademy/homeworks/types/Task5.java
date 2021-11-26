package by.itAcademy.homeworks.types;

public class Task5 {
    //1 минута = 60 секунд;
    //1 час = 3600 секунд;
    //1 день = 86400 секунд;
    //1 неделя = 604800 секунд;
    public static void main(String[] args) {
        int interval = 758962;
        int weeks = interval / 604800;
        int days = (interval % 604800) / 86400;
        int hours = (interval % 86400) / 3600;
        int minutes = ((interval % 86400) % 3600) / 60;
        int second = ((interval % 86400) % 3600) % 60;
        System.out.println(weeks);
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(second);


    }
}

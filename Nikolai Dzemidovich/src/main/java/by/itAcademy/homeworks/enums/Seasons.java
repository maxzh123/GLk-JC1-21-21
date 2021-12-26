package by.itAcademy.homeworks.enums;

import by.itAcademy.homeworks.types.MyReadHelper;

import java.util.Locale;

public enum Seasons {

    WINTER("Зима, холодно, метель, вьюго", 90),
    SPRING("Весна, не холодно, все цветет, есть настроение", 92),
    SUMMER("Лето, жарко, надо ехать на пляж", 92),
    AUTUMN("Осень, дождливо и депрессивно", 91);

    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {

        this.description = description;
        this.countOfDays = countOfDays;

    }

    public static void getDescription(Seasons seasons) {

        System.out.println(seasons.description + "\nКол-во дней в сезоне = " + seasons.countOfDays);

    }

    public static void getNextSeason() {

        String temp = MyReadHelper.readLine("Введите название сезона года :\n");
        System.out.println("Следующий сезон :");

        switch (temp.toLowerCase(Locale.ROOT)) {
            case "зима":
                Seasons.getDescription(SPRING);
                break;

            case "весна":
                Seasons.getDescription(SUMMER);
                break;

            case "лето":
                Seasons.getDescription(AUTUMN);
                break;

            case "осень":
                Seasons.getDescription(WINTER);
                break;

            default:
                System.out.println("Нет такого сезона либо он введен с ошибкой!");
        }
    }

    public static void getTheNumberOfDays() {

        String temp = MyReadHelper.readLine("Введите название сезона года :\n");
        System.out.println("Кол-во дней в сезоне :");

        switch (temp.toLowerCase(Locale.ROOT)) {
            case "зима":
                System.out.println(WINTER.countOfDays);
                break;

            case "весна":
                System.out.println(SPRING.countOfDays);
                break;

            case "лето":
                System.out.println(SUMMER.countOfDays);
                break;

            case "осень":
                System.out.println(AUTUMN.countOfDays);
                break;

            default:
                System.out.println("Нет такого сезона либо он введен с ошибкой!");

        }

    }
}

package by.itAcademy.homeworks.enums;

public enum Seasons {
    WINTER("Мороз, очень холодно, идёт снег, природа замирает",90),
    SPRING("Теплеет, снег тает, всё пробуждается",92),
    SUMMER("Жарко, периодически очень жарко, созревают ягоды и фрукты, все счастливы",92),
    AUTUMN("Прохладно,дождливо и пасмурно",91);

    private final String description;
    private int countOfDays;

    Seasons (String description, int countOfDays){
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription(){
        return description;
    }

    public int getCountOfDays(){
        return countOfDays;
    }

    public static void plusOneDayForWinter(){
        if (WINTER.countOfDays == 90)
            WINTER.countOfDays++;
    }

    public static void displayingInfoAboutSeason(Seasons season){
        System.out.println(season);
        System.out.println(season.getDescription());
        System.out.println(season.getCountOfDays() + " days");
    }

    public static Seasons getNextSeason(Seasons season){
        switch (season) {
            case WINTER:
                season = SPRING;
                break;
            case SPRING:
                season = SUMMER;
                break;
            case SUMMER:
                season = AUTUMN;
                break;
            case AUTUMN:
                season = WINTER;
                break;
        }
        return season;
    }

    public static int getCountOfDaysInSeason(Seasons season) {
        int days = 0;
        switch (season) {
            case WINTER:
                days = WINTER.countOfDays;
                break;
            case SPRING:
                days = SPRING.countOfDays;
                break;
            case SUMMER:
                days = SUMMER.countOfDays;
                break;
            case AUTUMN:
                days = AUTUMN.countOfDays;
                break;
        }
        return days;
    }
}

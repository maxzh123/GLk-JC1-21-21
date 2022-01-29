package by.itAcademy.homeworks.enums;

public enum Seasons {
    SPRING("теплеет, цветочки расцветают", 92),
    SUMMER("солце, пляж", 92),
    AUTUMN("холодает, листики опали", 91),
    WINTER("снег, холод, НГ", 90);

    private final String description;
    private int countOfDays;


    Seasons(String description, int countOfDays){
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public static Seasons nextSeason(Seasons season){
        switch (season){
            case WINTER:
                return SPRING;
            case SPRING:
                return SUMMER;
            case SUMMER:
                return AUTUMN;
            case AUTUMN:
                return WINTER;
        }
        return season;
    }

    public static int showCount(Seasons seasons){
        return seasons.countOfDays;
    }

}

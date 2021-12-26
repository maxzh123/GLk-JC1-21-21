package by.itAcademy.homeworks.enums;

public enum SeasonsOfTheYear {
    WINTER("приходится мерзнуть...брр...", 91),
    SPRING("все цветет и пахнет... плохо быть алергиком...",92),
    SUMMER("приключения алергика продолжаются... хотя есть и плюсы. Фрукты и ягоды есть...", 92),
    AUTUMN("пора собирать урожай и готовиться к зиме...",92);

    private final String description;
    private final int numberOfDays;

    SeasonsOfTheYear(String description, int countOfDays){
        this.description = description;
        this.numberOfDays = countOfDays;
    }

    public static SeasonsOfTheYear nextSeason(SeasonsOfTheYear season){  // метод получения следующего по счету сезона
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

    public static int getNumbersOfDaysInSeason(SeasonsOfTheYear season){ // метод получения дней в сезоне
        switch (season){
            case WINTER:
                return WINTER.numberOfDays;
            case SPRING:
                return SPRING.numberOfDays;
            case SUMMER:
                return SUMMER.numberOfDays;
            case AUTUMN:
                return AUTUMN.numberOfDays;

        } return season.numberOfDays;

    }

    public static String getDescription(SeasonsOfTheYear season){  // метод получения описания сезонае
        switch (season){
            case WINTER:
                return WINTER.description;
            case SPRING:
                return SPRING.description;
            case SUMMER:
                return SUMMER.description;
            case AUTUMN:
                return AUTUMN.description;

        }
        return season.description;
    }



}

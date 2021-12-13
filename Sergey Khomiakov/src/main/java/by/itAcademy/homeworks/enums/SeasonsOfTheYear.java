package by.itAcademy.homeworks.enums;

public enum SeasonsOfTheYear {
    WINTER("приходится мерзнуть...брр...", 91),
    SPRING("все цветет и пахнет... плохо быть алергиком...",92),
    SUMMER("приключения алергика продолжаются... хотя есть и плюсы. Фрукты и ягоды есть...", 92),
    AUTUMN("пора собирать урожай и готовиться к зиме...",92);

    String description;
    int countOfDays;

    SeasonsOfTheYear(String description, int countOfDays){
        this.description = description;
        this.countOfDays = countOfDays;
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

    public static void getNumbersOfDaysInSeason(SeasonsOfTheYear season){ // метод получения дней в сезоне
        switch (season){
            case WINTER:
                System.out.println("Количество дней зимой - " + WINTER.countOfDays);
                break;
            case SPRING:
                System.out.println("Количество дней весной - " + SPRING.countOfDays);
                break;
            case SUMMER:
                System.out.println("Количество дней летом - " + SUMMER.countOfDays);
                break;
            case AUTUMN:
                System.out.println("Количество дней осенью - " + AUTUMN.countOfDays);
                break;
        }

    }

}

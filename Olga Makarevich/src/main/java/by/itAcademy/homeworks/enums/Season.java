package by.itAcademy.homeworks.enums;

public enum Season {
    WINTER("Холод", 90),
    SPRING("Тепло", 92),
    SUMMER("Жарко", 92),
    FALL("Мокро", 92);

    private final String descriptions;
    private int countOfDays;

    Season(String descriptions, int countOfDays) {
        this.descriptions = descriptions;
        this.countOfDays = countOfDays;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    static Season getNextSeason(Season season) {
        switch (season) {
            case WINTER:
                return SPRING;
            case SPRING:
                return SUMMER;
            case SUMMER:
                return FALL;
            case FALL:
                return WINTER;
            default:
                System.out.println("Введите сезон правильно!!!");
                break;
        }
        return season;
    }

    static public Season valueOfString(String str){
        for(Season s:Season.values()){
            if (s.name().equalsIgnoreCase(str)) return s;
        }
        return null;
    }
}

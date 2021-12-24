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

    static String getNextSeason(String season) {
        switch (season) {
            case "winter":
                System.out.println("Следующий сезон - весна");
                break;
            case "spring":
                System.out.println("Следующий сезон - лето");
                break;
            case "summer":
                System.out.println("Следующий сезон - осень");
                break;
            case "fall":
                System.out.println("Следующий сезон - зима");
                break;
            default:
                System.out.println("Введите сезон правильно!");
                break;
        }
        return season;
    }
}

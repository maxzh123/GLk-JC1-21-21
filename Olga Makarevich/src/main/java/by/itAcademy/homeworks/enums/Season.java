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

    static Season getNextSeason(Season season1) {   // почему этот метод нельзя сделать void?
        switch (season1) {
            case WINTER:
                System.out.println("Следующий сезон - весна");
                break;
            case SPRING:
                System.out.println("Следующий сезон - лето");
                break;
            case SUMMER:
                System.out.println("Следующий сезон - осень");
                break;
            case FALL:
                System.out.println("Следующий сезон - зима");
                break;
            default:
                System.out.println("Введите сезон правильно!");
                break;
        }
        return season1;
    }

    public static Season valueOfString (String string) {    // если мы возвращаем null, почему нельзя сделать void?
        for (Season season2 : Season.values()) {
            if (season2.name().equalsIgnoreCase(string)) {
                return season2;
            }
        }
        return null;
    }

    static Season getNumberOfDay(Season season1) {   // почему этот метод нельзя сделать void?
        switch (season1) {
            case WINTER:
                System.out.println("Количество дней в сезоне - " + Season.WINTER.countOfDays);
                break;
            case SPRING:
                System.out.println("Количество дней в сезоне - " + Season.SPRING.countOfDays);
                break;
            case SUMMER:
                System.out.println("Количество дней в сезоне - " + Season.SUMMER.countOfDays);
                break;
            case FALL:
                System.out.println("Количество дней в сезоне - " + Season.FALL.countOfDays);
                break;
            default:
                System.out.println("Введите сезон правильно!");
                break;
        }
        return season1;
    }
    @Override
    public String toString() {
        switch (this) {
            case WINTER:
                return "Зима";
            case SPRING:
                return "Весна";
            case SUMMER:
                return "Лето";
            case FALL:
                return "Осень";
        }
        return "Нет такого сезона";
    }

}

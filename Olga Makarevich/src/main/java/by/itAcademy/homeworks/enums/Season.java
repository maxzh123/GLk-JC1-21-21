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


}

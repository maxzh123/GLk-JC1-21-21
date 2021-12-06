package by.itAcademy.homeworks.enums;

public enum SeasonsOfTheYear {
    Winter("Холодно и снежно", 90),
    Sprin("Начало цветения и аллергия на это цветение",92),
    Summer("Жара, квас и мороженое",92),
    Autumn("Дожди и ветра",92);
    int indexOfSeason;

    String description;
    int countOfDays;

    //конструктор
    SeasonsOfTheYear(String description, int countOfDays){
        this.description = description;
        this.countOfDays = countOfDays;
    }

      //получение индекса следующего сезона
    public void nextIndexOfSeason(SeasonsOfTheYear season){
        indexOfSeason = season.ordinal();
        if (indexOfSeason == 3) {
            indexOfSeason = 0;
        } else {
            indexOfSeason++;
        }
    }

    //вывод названия следующего сезона
    public String printSeasin(){
        String msg = "";
        switch (indexOfSeason){
            case 0:
                msg = "Следующий сезон - " + Winter.name();
                break;
            case 1:
                msg = "Следующий сезон - " + Sprin.name();
                break;
            case 2:
                msg = "Следующий сезон - " + Summer.name();
                break;
            case 3:
                msg = "Следующий сезон - " + Autumn.name();
                break;
        }
        return msg;
    }
}

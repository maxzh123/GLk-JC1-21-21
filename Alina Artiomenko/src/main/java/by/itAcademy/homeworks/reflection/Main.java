package by.itAcademy.homeworks.reflection;

public class Main implements ActionOfPerson{
    private String nameOfCaptain;
    private String surnameOfCaptain;
    private int ageOfCaptain;
    private int amountSeatsOnTheBoat;
    private int amountOfPassengers = 0;

    Main(String nameOfCaptain, String surnameOfCaptain, int ageOfCaptain, int amountSeatsOnTheBoat) {
        this.nameOfCaptain = nameOfCaptain;
        this.surnameOfCaptain = surnameOfCaptain;
        this.ageOfCaptain = ageOfCaptain;
        this.amountSeatsOnTheBoat = amountSeatsOnTheBoat;
    }
//
//    public String getName() {
//        return nameOfCaptain;
//    }
//
//    public void setName(String name) {
//        this.nameOfCaptain = name;
//    }
//
//    public String getSurname() {
//        return surnameOfCaptain;
//    }
//
//    public void setSurname(String surname) {
//        this.surnameOfCaptain = surname;
//    }
//
//    public int getAge() {
//        return ageOfCaptain;
//    }
//
//    public void setAge(int age) {
//        this.ageOfCaptain = age;
//    }

    @Override
    public void putInTheBoat() {
        if(amountOfPassengers >= amountSeatsOnTheBoat){
            System.out.println("Свободных мест нет!");
        } else {
            amountOfPassengers++;
            System.out.println("На борт принят еще один пассажир!");
        }
    }

    @Override
    public void disembarkFromTheBoat() {
        if (amountOfPassengers == 0){
            System.out.println("На борту нет пассажиров! Нам некого высаживать!");
        } else{
            amountOfPassengers--;
            System.out.println("Один пассажир покинул наш борт!");
        }
    }

    @Override
    public void checkNumberOfFreeSeatsInTheBoat() {
        System.out.println(amountSeatsOnTheBoat - amountOfPassengers + " свободных мест");
    }

    @Override
    public void checkNumberOfPessengersInTheBoat() {
        System.out.println("На борту " + amountOfPassengers + " пассажир(ов)");
    }
}

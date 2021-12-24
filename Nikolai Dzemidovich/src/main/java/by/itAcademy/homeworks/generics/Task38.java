package by.itAcademy.homeworks.generics;

public class Task38 {
    /** Создать поле name в классе Vehicle и проинициализировать его через
> конструктора. Создать generic класс Garage, который может хранить только объекты
> типа наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с
> клавиатуры) и вывести на экран имя хранимого транспортного средства.*/

    public static void main(String[] args) {
        Garage<Car> veh1 = new Garage<>();
        Garage<Motorcycle> veh2 = new Garage<>();

        veh1.addVehicle(new Car());
        veh2.addVehicle(new Motorcycle());

        System.out.println("В первом гараже - " + veh1.getInfo());
        System.out.println("Во втором гараже - " + veh2.getInfo());

    }
}
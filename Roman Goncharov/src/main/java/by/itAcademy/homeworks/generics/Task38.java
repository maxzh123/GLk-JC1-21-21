package by.itAcademy.homeworks.generics;

/**
 * Задание 38
 * Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle. Создать поле name в классе Vehicle
 * и проинициализировать его через конструктора. Создать generic класс Garage, который может хранить только объекты
 * типа наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран
 * имя хранимого транспортного средства.
 */

public class Task38 {
    public static void main(String[] args) {
        Car car = new Car("BMW","x5");
        Motorcycle moto = new Motorcycle("Harley Davidson","1200 FX");
        Garage <Car> Garage1 = new Garage<>();
        Garage <Motorcycle> Garage2 = new Garage<>();
        Garage1.setVehicle(car);
        Garage2.setVehicle(moto);
        System.out.println("В гараже номер 1 хранится: " + Garage1);
        System.out.println("В гараже номер 2 хранится: " + Garage2);
    }
}

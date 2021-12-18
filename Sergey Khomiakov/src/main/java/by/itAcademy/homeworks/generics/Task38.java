package by.itAcademy.homeworks.generics;

/** Задание 38
 * 1) Создать класс Vehicle, поле name и проинициализировать его через конструктор
 * 2) Создать классы Car и Motorcycle, которые наследуются от Vehicle.
 * 3) Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
 * 4) Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого
 * транспортного средства
  */

public class Task38 {
    public static void main(String[] args) {
        Garage<Car> garageForCar = new Garage<>();
        Garage<Motorcycle> garageForMotorcycle = new Garage<>();

        Car car = new Car("Volvo","S40", 2002);
        Motorcycle moto = new Motorcycle("Kawasaki", "Z400", 2019);

        garageForCar.addVehicleToGarage(car);
        garageForMotorcycle.addVehicleToGarage(moto);

        System.out.println(garageForCar.getVehicleFromGarage());
        System.out.println(garageForMotorcycle.getVehicleFromGarage());

    }
}

package by.itAcademy.homeworks.generics;

/**Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle. Создать поле name
 * в классе Vehicle и проинициализировать его через конструктора. Создать generic класс Garage, который
 * может хранить только объекты типа наследуемого от Vehicle. Создать 2 объекта класса Garage
 * (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.
 **/

public class Task38 {
    public static void main(String[] args) {
        Garage <Vehicle> Garage1 = new Garage<>();
        Garage <Vehicle> Garage2 = new Garage<>();
        Garage1.addVehicle(new Car("Peugeot","308"));
        Garage2.addVehicle(new Motorcycle("BMW","K1300S"));
        System.out.println("В гараже номер 1 хранится: " + Garage1);
        System.out.println("В гараже номер 2 хранится: " + Garage2);
    }

}

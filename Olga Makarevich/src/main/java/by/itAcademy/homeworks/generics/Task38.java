package by.itAcademy.homeworks.generics;

// Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
// Создать поле name в классе Vehicle и проинициализировать его через конструктора.
// Создать generic класйс Garage, которы может хранить только объекты типа наследуемого от Vehicle.
// Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.

import by.itAcademy.homeworks.generics.vehicle.Garage;
import by.itAcademy.homeworks.generics.vehicle.Vehicle;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Garage <Vehicle> garage1 = new Garage();
        String name = garage1.createNameVehicle();
        String nameVehicle = garage1.createObjectGarage();
        System.out.println("В гараже хранится - " + nameVehicle + " " + name);

    }
}

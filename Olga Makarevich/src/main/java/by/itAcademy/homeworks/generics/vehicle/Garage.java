package by.itAcademy.homeworks.generics.vehicle;

import java.util.Scanner;

public class Garage <T extends Vehicle>{
    static String nameVehicle;

    public static String createNameVehicle () {
        Scanner scr1 = new Scanner(System.in);
        System.out.println("Enter name of vehicle");
        nameVehicle = scr1.nextLine();
        return nameVehicle;
    }

    public String createObjectGarage () {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter \"Car\" or \"Motorcycle\"");
        String vehicle = scr.nextLine();
        if (vehicle == "Car") {
            System.out.println("");
        } else if (vehicle == "Motorcycle") {
            System.out.println("");
        } else {
            System.out.println("Vehicle name entered incorrectly!");
        }
        return vehicle;
    }
}

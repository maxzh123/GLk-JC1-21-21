package by.itAcademy.homeworks.generics;

import java.util.Scanner;

/**Задание 38
 * 1. Создать класс Vehicle с полем name, проинициализировать его через конструктор
 * 2. Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle
 * 3. Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle
 * 4. Создать 2 объекта класса Garage (все поля ввести с клавиатуры)
 * 5. Вывести на экран имя хранимого транспортного средства
 */

public class Task38 {
    public static void main(String[] args){
        Garage car = newGarageObj(getTypeVehicle(),getTrademark(),getModel(),getYearOfProduct());
        System.out.println(car.getTypeOfVehicle().toString());
    }

    //create new object type Car or Motocycle
    public static Garage<?> newGarageObj(int type, String trademark, String model, int yearOfProduct){
        if (type == 1){
            Garage<Car> car = new Garage<>();
            car.setTypeOfVehicle(newCar(trademark,model,yearOfProduct));
            return car;
        } else if(type == 2){
            Garage<Motorcycle> motorcycle = new Garage<>();
            motorcycle.setTypeOfVehicle(newMotocycle(trademark,model,yearOfProduct));
            return motorcycle;
        } else {
            return null;
        }
    }

    public static Car newCar(String trademark, String model, int yearOfProduct){
        Car newCar = new Car(trademark,model,yearOfProduct);
        return newCar;
    }

    public static Motorcycle newMotocycle(String trademark, String model, int yearOfProduct){
        Motorcycle newMotocycle = new Motorcycle(trademark,model,yearOfProduct);
        return newMotocycle;
    }

    public static int getTypeVehicle(){
        System.out.print("Введите вид транспорта - автомобиль(1) или мотоцикл(2): ");
        int type = createScanner().nextInt();
        while((type != 1) && (type != 2)){
            System.out.println("*** Не верно указано значение! ***");
            System.out.print("Введите вид транспорта - автомобиль(1) или мотоцикл(2): ");
            type = createScanner().nextInt();
        }
        return type;
    }

    public static String getTrademark(){
        System.out.print("Введите торговую марку: ");
        String trademark = createScanner().nextLine();
        return trademark;
    }

    public static String getModel(){
        System.out.print("Введите модель: ");
        String model = createScanner().nextLine();
        return model;
    }

    public static int getYearOfProduct(){
        System.out.print("Введите год производства: ");
        int year = createScanner().nextInt();
        return year;
    }

    public static Scanner createScanner(){
        Scanner input = new Scanner(System.in);
        return input;
    }
}

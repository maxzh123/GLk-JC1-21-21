package by.itAcademy.homeworks.generics;

public abstract class Vehicle implements VehicleBehave {
    private final String name;

    public Vehicle(String name){
        this.name = name;
    }

    @Override
    public void wasteOfGas() {          // просто рандомный метод, чтобы не было так пусто и грустно
        System.out.println("Потребляем топливо");

    }

    @Override
    public void run() {                 // просто рандомный метод, чтобы не было так пусто и грустно
        System.out.println("Едемь на каком-то транспортном средстве");
    }

    public String getName(){            // получаем имя транспортного средства, которое будет создано
        return name;
    }

    @Override
    public String toString() {          // переопределяем метод toString для всех случаев класса Vehicle
        return "Транспортное средство {" +
                "name='" + name + '\'' +
                '}';
    }
}

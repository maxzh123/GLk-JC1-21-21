package by.itAcademy.homeworks.generics;

public class Car extends Vehicle{
    private final String producer;
    private final String model;
    private final int yearOfIssue;

    public Car(String producer, String model, int yearOfIssue) {
        super("Автомобиль");
        this.producer = producer;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public void run() {              // переопределяем родительский метод, и уточняем, что мы уже используем автомобиль
        System.out.println("Едем на машине");
    }

    @Override
    public String toString() {      // переопределяем метод toString для объектов класса Car
        return getName() + " {" +
                "производитель='" + producer + '\'' +
                ", модель='" + model + '\'' +
                ", год изготовления=" + yearOfIssue +
                '}';
    }


}

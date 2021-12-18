package by.itAcademy.homeworks.generics;

public class Motorcycle extends Vehicle {
    private final String producer;
    private final String model;
    private final int yearOfIssue;

    public Motorcycle(String producer, String model, int yearOfIssue){
        super("Мотоцикл");
        this.producer = producer;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public void run() {                // переопределяем родительский метод, и уточняем, что мы уже используем мотоцикл
        System.out.println("Едем на мотоцикле");
    }

    @Override
    public String toString() {        // переопределяем метод toString для объектов класса Motorcycle
        return getName() + " {" +
                "производитель='" + producer + '\'' +
                ", модель='" + model + '\'' +
                ", год изготовления=" + yearOfIssue +
                '}';
    }
}





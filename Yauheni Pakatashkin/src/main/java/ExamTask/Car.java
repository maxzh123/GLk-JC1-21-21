package ExamTask;

public class Car {
    private String name;
    private CarModel model;
    private int engineСapacity;

    public Car(String name, CarModel model, int engineСapacity) {
        this.name = name;
        this.model = model;
        this.engineСapacity = engineСapacity;
    }

    public String getName() {
        return name;
    }

    public CarModel getModel() {
        return model;
    }

    public int getEngineСapacity() {
        return engineСapacity;
    }
}

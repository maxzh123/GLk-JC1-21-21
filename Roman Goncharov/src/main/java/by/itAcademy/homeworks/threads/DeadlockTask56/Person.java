package by.itAcademy.homeworks.threads.DeadlockTask56;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void stateYourName(Person person) throws InterruptedException {
        Thread.sleep(1000);
        person.stateYourNameBack(this);
        this.stateYourNameBack(person);
    }

    public synchronized void stateYourNameBack(Person person) {
        System.out.println("Меня зовут " + person.getName());
    }
}

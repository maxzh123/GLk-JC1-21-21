package by.itAcademy.homeworks.threads.DeadlockTask56;

public class Acquaintance implements Runnable {
    private final Person person, otherPerson;

    public Acquaintance(Person person, Person otherPerson) {
        this.person = person;
        this.otherPerson = otherPerson;
    }

    @Override
    public void run() {
        try {
            person.stateYourName(otherPerson);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

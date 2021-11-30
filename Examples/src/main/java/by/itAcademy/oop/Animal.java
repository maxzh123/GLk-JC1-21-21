package by.itAcademy.oop;

public interface Animal {

    public void say();

    default void saySaySay() {
        say();
        say();
        say();
    }
}

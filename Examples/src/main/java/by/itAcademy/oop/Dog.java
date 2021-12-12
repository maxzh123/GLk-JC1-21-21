package by.itAcademy.oop;

public abstract class Dog implements Animal {
    private int a=1;
    @Override
    public void say() {

        System.out.println("Гав гав "+a++);
    }
}

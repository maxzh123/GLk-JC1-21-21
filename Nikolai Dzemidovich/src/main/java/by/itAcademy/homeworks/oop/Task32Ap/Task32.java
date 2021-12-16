package by.itAcademy.homeworks.oop.Task32Ap;

public class Task32 {
    public static void main(String[] args) {

        Refrigerator ref = new Refrigerator("Samsung","X003-15",2021);
        Hoover hov = new Hoover("Xiaomi", "YOp-15", 2021);

        ref.turnOn();
        ref.printInfo();

        hov.turnOn();
        hov.printInfo();
    }
}

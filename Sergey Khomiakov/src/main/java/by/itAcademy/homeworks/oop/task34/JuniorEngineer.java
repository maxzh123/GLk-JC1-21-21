package by.itAcademy.homeworks.oop.task34;

public class JuniorEngineer extends Engineer{
    public JuniorEngineer(String position, String name, double workingHours, double standardHours) {
        super(position, name, workingHours, standardHours);
    }

    public void study(){
        System.out.println("Время учиться");
    }

    @Override
    public void getSalary() {
        super.increaseCoefficient = 0.89;
        super.bonus = 200;
        super.getSalary();
    }
}

package by.itAcademy.homeworks.oop.Task34Factory;

public abstract class Manager extends LaborOrganizationDepartment implements Employee {
    private final String position;
    String name;
    int age;

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Manager(String workSchedule, String workplace, String wage, String position) {
        super(workSchedule, workplace, wage);
        this.position = position;
    }

    public void employeeDescription() {
        System.out.println(name + " " + age + " years, " + position);
        setWorkSchedule();
        setWorkplace();
        setWage();
        payroll();
    }
}
package by.itAcademy.homeworks.oop.Task34Factory;

public class LaborOrganizationDepartment implements Employer {
    private final String workSchedule, workplace, wage;

    public LaborOrganizationDepartment(String workSchedule, String workplace, String wage) {
        this.workSchedule = workSchedule;
        this.workplace = workplace;
        this.wage = wage;
    }

    @Override
    public void setWorkSchedule() {
        System.out.println("График работы: " + workSchedule);
    }

    @Override
    public void setWorkplace() {
        System.out.println("Рабочее место: " + workplace);
    }

    @Override
    public void setWage() {
        System.out.println("Вид заработной платы: " + wage);
    }

    @Override
    public void payroll() {
        System.out.print("Подсчёт и начисление заработной платы работнику: ");
    }
}
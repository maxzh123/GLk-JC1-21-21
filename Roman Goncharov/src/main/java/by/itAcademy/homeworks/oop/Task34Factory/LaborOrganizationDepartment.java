package by.itAcademy.homeworks.oop.Task34Factory;

public class LaborOrganizationDepartment implements Employer, Contract {
    private final String workSchedule, workplace, wage;
    private final String contract;

    public LaborOrganizationDepartment(String workSchedule, String workplace, String wage, String contract) {
        this.workSchedule = workSchedule;
        this.workplace = workplace;
        this.wage = wage;
        this.contract = contract;
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

    @Override
    public void concludeContract() {
        System.out.println("Заключаемый договор: " + contract);
    }
}
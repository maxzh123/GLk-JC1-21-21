import java.math.BigDecimal;

public class Employe {
    private int personnelNumber;
    private String lastName;
    private String firstName;
    private String patronymic;
    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSalary(BigDecimal salary) {
        this.salary=salary;
    }

    public Employe() {
    }

    public Employe(int personnelNumber, String lastName, String firstName, String patronymic) {
        this.personnelNumber = personnelNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Работник " + lastName + " " + firstName + " " + patronymic;
    }
}
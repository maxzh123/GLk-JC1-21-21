import java.math.BigDecimal;
import java.sql.Date;

public class Salary {
    private Date dateOfSalary;
    private BigDecimal salary;

    public Salary(Date dateOfSalary, BigDecimal salary) {
        this.dateOfSalary = dateOfSalary;
        this.salary = salary;
    }

    public Date getDateOfSalary() {
        return dateOfSalary;
    }

    public void setDateOfSalary(Date dateOfSalary) {
        this.dateOfSalary = dateOfSalary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return dateOfSalary + " " + salary;
    }
}

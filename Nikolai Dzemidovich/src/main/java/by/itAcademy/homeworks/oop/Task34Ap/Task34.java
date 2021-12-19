package by.itAcademy.homeworks.oop.Task34Ap;



public class Task34 {
    public static void main(String[] args) {
        Engineer e1 = new Engineer("Артур", "Чепайрян");
        e1.getJobDescription();
        e1.setPersonalInformation();
        e1.setSalary();

        Loader l1 = new Loader("Алексей", "Щербаков");
        l1.getJobDescription();
        l1.setPersonalInformation();
        l1.setSalary();

        Chief c1 = new Chief("Тамби", "Масаев");
        c1.getJobDescription();
        c1.setPersonalInformation();
        c1.setSalary();




    }
}

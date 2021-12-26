package by.itAcademy.homeworks.oop.Factory;
//
//public class Locksmith extends Workers{
//    double hoursWorkedPerMonth;
//    double prize;
//
//    public Locksmith(String name, String lastName, String position, double rateOfHoursPerMonth, double producedProductsPerMonth, double percent, double hoursWorkedPerMonth) {
//        super(
//                name,
//                lastName,
//                position,
//                rateOfHoursPerMonth,
//                producedProductsPerMonth,
//                percent);
//        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
//    }
//
//    @Override
//    public void interestWages(double rateOfHoursPerMonth, double hoursWorkedPerMonth) {
//        System.out.println("Произведено продукции на сумму в отработанном месяце: " + producedProductsPerMonth);
//        System.out.println("Ставка процента от суммы произведенной продукции: " + percent);
//        double salaryOfMonth = producedProductsPerMonth*percent/100;
//        if (hoursWorkedPerMonth >= rateOfHoursPerMonth) {
//            prize = salaryOfMonth*2;
//        } else {
//            prize = 0;
//        }
//        System.out.println("Заработная плата за отработнанный месяц составляет: " + salaryOfMonth + prize);
//    }
//}

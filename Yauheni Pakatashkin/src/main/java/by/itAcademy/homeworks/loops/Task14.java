package by.itAcademy.homeworks.loops;

public class Task14 {
    public static void main(String[] args) {
        long i =7893823445L;
        int sum=0;
        do {
            sum += i%10;
            i=i/10;
        }
        while (i>0);
        System.out.println("Сумма цифр числа 7893823445 = "+sum);

    }
}

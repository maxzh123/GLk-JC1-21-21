package by.itAcademy.homeworks.loops;

public class Task14 {
    public static void main(String[] args) {

        System.out.println("Сумма = " + Task14.getTheSumOfNumbers(7893823445L));

    }

    public static int getTheSumOfNumbers(long number) {

        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        } while (number != 0);

        return sum;
    }
}


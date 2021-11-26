package by.itAcademy.homeworks.loops;

/*
Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Task14 {
    public static void main(String[] args) {
        Task14 task14 = new Task14();
        System.out.println(task14.getTheSumOfUnits(7893823445L));
    }

    public int getTheSumOfUnits(long number){

        int countsOfDigits = String.valueOf(Math.abs(number)).length();
        int count = 0;
        int sum = 0;

        do{
            sum += number%10;
            number/=10;
            count++;
              } while (count< countsOfDigits);

        return sum;
    }

}

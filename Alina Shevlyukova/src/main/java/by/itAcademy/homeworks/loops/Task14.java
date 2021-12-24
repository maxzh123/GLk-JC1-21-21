package by.itAcademy.homeworks.loops;

public class Task14 {
    public static void main(String[] args){
        System.out.println(getSumOfNumber(7893823445L));
    }

    public static int getSumOfNumber(long number){
        int numberLenght = String.valueOf(number).length();
        int sum = 0;
        int i = 0;

        do {
            sum += number % 10;
            number /= 10;
            i++;
        } while (i < numberLenght);

        return sum;
    }
}

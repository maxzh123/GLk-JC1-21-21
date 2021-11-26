package by.itAcademy.homeworks.loops;

public class Task13 {
    public static void main(String[] args) {
        int count =1;
        double a = 1d;
        do{
            a*=count;
            count++;
        }
        while (count<26);
        System.out.println("Произведение чисел от 1 до 25 = "+a);

    }
}

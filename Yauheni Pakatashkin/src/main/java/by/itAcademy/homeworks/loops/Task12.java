package by.itAcademy.homeworks.loops;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    private static double factorial(int a){
        double result = 1;
        while (a>0){
            result*=a;
            a--;
        }
        return result;
    }
}

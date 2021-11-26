package by.itAcademy.homeworks.types;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(compute(100, 200));
        System.out.println(compute(342, 56));
        System.out.println(compute(7986, 13413));
    }

    static int compute(int first, int second) {
        int sum = first + second;
        int multiplication = first * second;
        return sum + multiplication;
    }
}

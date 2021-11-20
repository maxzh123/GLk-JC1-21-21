package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int x = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(checking(x));


    }

    public static boolean checking(int a) {
        if (a == 7 || a == -7 || a % 10 == 7 || a % 10 == -7) {
            return true;
        } else {
            return false;
        }
    }

}

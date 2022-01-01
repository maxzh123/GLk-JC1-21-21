package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyThread52 extends Thread {
    private final static Random random = new Random();

    public void run() {
        System.out.println(getName() + " создал коллекцию: " + creationAndFillingList(10) +
                " и высчитал среднее арифмитическое ёё чисел равное "
                + arithmeticMeanOfTheNumbers(creationAndFillingList(10)));
    }

    public static List<Integer> creationAndFillingList(int amountOfNumbers) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < amountOfNumbers; i++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }

    public static double arithmeticMeanOfTheNumbers(List<Integer> arrayList) {
        int sum = 0, count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
            count++;
        }
        return (double) sum / count;
    }
}
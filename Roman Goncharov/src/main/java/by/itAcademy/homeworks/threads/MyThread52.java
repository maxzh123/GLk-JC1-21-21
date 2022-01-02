package by.itAcademy.homeworks.threads;

import java.util.List;

public class MyThread52 extends Thread {
    public void run() {
        List<Integer> arrayListForThread = Task52.creationAndFillingList(10);
        System.out.println(getName() + " создал коллекцию: " + arrayListForThread +
                " и высчитал среднее арифмитическое ёё чисел равное "
                + arithmeticMeanOfTheNumbers(arrayListForThread));
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
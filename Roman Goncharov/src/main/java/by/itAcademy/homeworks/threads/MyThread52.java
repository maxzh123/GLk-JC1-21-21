package by.itAcademy.homeworks.threads;

import java.util.List;

public class MyThread52 extends Thread {
    private final List<Integer> arrayListForThread;

    public MyThread52(List<Integer> arrayListForThread) {
        this.arrayListForThread = arrayListForThread;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " создал коллекцию: " + arrayListForThread +
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
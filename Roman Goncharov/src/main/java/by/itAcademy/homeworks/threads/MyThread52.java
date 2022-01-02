package by.itAcademy.homeworks.threads;

import java.util.List;

public class MyThread52 extends Thread {
    public void run() {
        System.out.println(getName() + " создал коллекцию: " + Task52.arrayList +
                " и высчитал среднее арифмитическое ёё чисел равное "
                + arithmeticMeanOfTheNumbers(Task52.arrayList));
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
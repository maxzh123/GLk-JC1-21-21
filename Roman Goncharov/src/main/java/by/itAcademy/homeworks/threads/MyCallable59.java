package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallable59 implements Callable<String> {

    @Override
    public String call() throws Exception {
        List<Integer> listForCall = creationAndFillingList(3);
        TimeUnit.SECONDS.sleep((int) (Math.random() * 10 + 1));
        int sum = sumOfNumbersInList(listForCall);
        return Thread.currentThread().getName() + " результат выполнения задачи: сумма чисел равная " + sum +
                " коллекции " + listForCall;
    }

    public List<Integer> creationAndFillingList(int amountOfNumbers) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amountOfNumbers; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.println(Thread.currentThread().getName() + " сгенерировал коллекцию из рандомных чисел: " +
                arrayList);
        return arrayList;
    }

    public int sumOfNumbersInList(List<Integer> list) {
        ListIterator<Integer> it = list.listIterator();
        Integer sum = 0;
        while (it.hasNext()) {
            Integer next = it.next();
            sum += next;
        }
        System.out.println(Thread.currentThread().getName() + " посчитал сумму чисел коллекции");
        return sum;
    }
}
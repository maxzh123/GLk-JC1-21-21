package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.collections.HelperForCollections;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/** Задание 59
 * 1) Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых
 * чисел -> засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих
 * чисел в виде строки.
 * 2) Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на
 * экран с указанием имени потока, который выполняет работу.
 */

public class MyCallableFor59 implements Callable <String>{

    @Override
    public String call() throws Exception {
        System.out.println("Начинает работу: " + Thread.currentThread().getName() + " : "+ LocalTime.now());
        List<Integer> listOfRandomNumbers = HelperForCollections.fillTheArrayList(10);
        TimeUnit.SECONDS.sleep(new Random().nextInt(9)+1);
        System.out.format("Результат работы: %d, поток - %s, текущее время - %s\n",getSumOfNumbers(listOfRandomNumbers),
                                                                    Thread.currentThread().getName(), LocalTime.now());
        return Thread.currentThread().getName();
    }

    public static int getSumOfNumbers(List<Integer> listOfRandomNumbers){
        Integer sum = 0;
        for(Integer i:listOfRandomNumbers){
            sum+=i;
        }
        return sum;
    }
}

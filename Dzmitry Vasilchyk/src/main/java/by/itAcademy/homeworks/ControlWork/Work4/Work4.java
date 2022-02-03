package by.itAcademy.homeworks.ControlWork.Work4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**Создать класс потока(PlayerGeneratorTask), который генерирует коллекцию из
 * 10 объектов класса Player с полями name(String), age(Integer), isActive(boolean)
 * по условию: name – любое, age – от 20 до 40, isActive – true/false и записывает ее в
 * файл. Поток возвращает имя файла, в который он писал.
 * Создать класс потока(PlayerReaderTask), который читает файл и возвращает коллекцию
 * активных Player в возрастном диапазоне от 25 до 30.
 * Создать пул потоков из 4 штук
 * Запустить 20 потоков класса PlayerGeneratorTask.
 * Запустить поток класса PlayerReaderTask на каждый выполненный PlayerGeneratorTask.
 * Отсортировать по возрасту и вывести на экран имена 5 игроков в UpperCase, удовлетворяющие
 * условию с помощью Stream API.**/

public class Work4 {
    public static void main(String[] args) {
      //  Thread myTheady=new Thread(new PlayerGeneratorTask());
      //  myTheady.start();
     //   Thread myTheadyRead=new Thread(new PlayerReaderTask());
      //  myTheadyRead.start();
        ExecutorService executor= Executors.newFixedThreadPool(4);
        for(int i=0;i<20;i++){
            Runnable worker=new PlayerGeneratorTask();
            Runnable worker1=new PlayerReaderTask();
            executor.execute(worker);
            executor.execute(worker1);
        }
        executor.shutdown();
        while (!executor.isTerminated()){
        }
        System.out.println("Finish");
    }
}



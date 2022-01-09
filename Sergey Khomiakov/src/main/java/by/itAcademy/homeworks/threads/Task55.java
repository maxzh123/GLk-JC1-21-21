package by.itAcademy.homeworks.threads;


/** Задание 55
 * 1) Создать метод, который печатает название потока и засыпает на 2 секунды.
 * 2) Запустить одновременно 10 потоков.
 * 3) Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
 */

public class Task55 {

    public static void main(String[] args){
        MyThreadForTask55 task = new MyThreadForTask55();
        int countOfThreads = 10;
        for(int i = 0; i < countOfThreads; i++){
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}

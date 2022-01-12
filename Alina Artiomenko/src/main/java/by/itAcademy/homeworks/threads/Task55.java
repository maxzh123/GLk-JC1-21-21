package by.itAcademy.homeworks.threads;

/**Задание 55
 * 1. Создать метод, который печатает название потока и засыпает на 2 секунды
 * 2. Запустить одновременно 10 потоков
 * 3. Реализовать механизм синхронизации, чтобы все потоки выполнялись последовательно
 */

public class Task55 {
    public static void main(String[] args) {
        final int amountOfThreads = 10;

        for (int i = 0; i < amountOfThreads; i++){
            MyThreadsTask55 t = new MyThreadsTask55();
            Thread thread = new Thread(new MyThreadsTask55());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

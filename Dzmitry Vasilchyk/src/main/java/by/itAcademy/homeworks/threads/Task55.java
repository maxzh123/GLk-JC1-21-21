package by.itAcademy.homeworks.threads;

/**Создать метод, который печатает название потока и засыпает на 2 секунды.
 * Запустить одновременно 10 потоков. Реализовать механизм синхронизации,
 * чтобы все потоки выполнились последовательно.**/

public class Task55 {
    public static void main(String[] args) {
        final int num=10;
        for (int i=0;i<num;i++){
            MyThreadTask55 mt=new MyThreadTask55();
            try{
                mt.th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

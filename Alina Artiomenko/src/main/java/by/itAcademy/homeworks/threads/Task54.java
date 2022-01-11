package by.itAcademy.homeworks.threads;

/**Задание 54
 * 1. Создать класс-поток
 * 2. В это класса реализуется создание файла
 * 3. Запись в файл массива из 10 случайных целых чисел
 * 4. Запустить 5 потоков
 */

public class Task54 {
    public static void main(String[] args) {
        final int amoutOfThreads = 5;

        for(int i = 0; i < amoutOfThreads; i++){
            new MyThreadsTask54();
        }
    }
}

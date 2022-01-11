package by.itAcademy.homeworks.threads;

/**Задание 53
 * 1. Создать класс-поток
 * 2. В этом классе генерирует массив случайных целых чисел из 10 элементов
 * 3. Находит максимальный элемент в этом массиве
 * 4. Выводит в формате: имя потока, максимальный элемент
 * 5. Запустить 10 потоков
 */
public class Task53 {
    public static void main(String[] args) {
        final int amountOfThreads = 10;

        for (int i = 0; i < amountOfThreads; i++){
            new MyThreadsTask53();
        }
    }
}

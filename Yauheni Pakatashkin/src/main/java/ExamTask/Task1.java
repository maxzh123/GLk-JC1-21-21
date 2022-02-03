package ExamTask;
/**
 * Сгенерировать три произвольных целых числа X, Y и Z. Если X больше Z, то вывести на экран сумму X и Y,
 * иначе вывести на экран значение Z.
 * Вывести на экран среднее арифметическое этих чисел.
 */

public class Task1 {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 10);
        System.out.println("X = " + x + "; Y = " + y + "; Z = " + z);
        System.out.println(operation(x,y,z));
        average(x,z,z);
    }

    public static int operation(int a, int b, int c){
        return a > c ? a+b : c;
    }

    public static void average(int x, int y, int z){
        System.out.println("Среднее арифметическое = " + (double)(x+y+z)/3);
    }
}

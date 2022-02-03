package by.itAcademy.homeworks.ControlWork;

/**Сгенерировать три произвольных целых числа X, Y и Z.
 * Если X больше Z, то вывести на экран сумму X и Y,
 * иначе вывести на экран значение Z. Вывести на экран среднее
 * арифметическое этих чисел. **/

public class Work1 {
    public static void main(String[] args) {
        int num=3;
        float sum=0;
        int[] massiv = new int[num];
        for (int i = 0; i < num; i++) {
            massiv[i] = (int) (Math.random() * 10);
            sum+=massiv[i];
            System.out.print(massiv[i]+" ");
        }
        System.out.println("\n"+sum/3);
        if (massiv[0] > massiv[2]) {
            System.out.println((massiv[0] + massiv[1]));
        }
        System.out.println(massiv[2]);
    }
}

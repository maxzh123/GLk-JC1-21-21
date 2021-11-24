package by.itAcademy.homeworks.arrays;

/**Задание 19
 * 1. Создать массив из 10 элементов
 * 2. Заполнить массив произвольными значениями типа int
 * 3. Выведите на экран элементы, стоящие на четных позициях
 */
public class Task19 {
    public static void main(String[] args){
        int [] arraySecond = {15, -3, 14, 0, 33, 4, -45, -78, 8, 3};

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0 || i == 0)
                System.out.println("arr[" + i + "] = " + arraySecond[i]);
        }
    }
}

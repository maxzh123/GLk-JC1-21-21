package by.itAcademy.homeworks.arrays;

/** Задание 23
 * Создать двумерный массив и заполнить его 'бабочкой'.
 */

public class Task23 {
    public static void main(String[] args) {
        int x = 5;
        int[][] newArray = new int[x][x];
        getButterfly(newArray);
    }

    public static void getButterfly (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= array.length/2 && i <= j && j < array[i].length - i) {
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else if (i >= array.length/2) {
                    array[i][j] = array[array.length - 1 - i][j];
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

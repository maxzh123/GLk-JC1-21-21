package by.itAcademy.homeworks.arrays;

// Задание 23
// Создать двумерный массив и заполнить его 'бабочкой'.

public class Task23 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == 1 || i == 3) && (j == 0 || j == 4) || i == 2 && j != 2) {
                    System.out.print(array[i][j] + " ");
                } else {
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

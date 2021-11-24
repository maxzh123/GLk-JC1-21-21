package by.itAcademy.homeworks.operators;

//Создайте метод с одним целочисленным параметром.
//Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение


public class Task6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1000;
        int x = a + (int) (Math.random() * b);
        System.out.println(seven(x));
    }

    public static boolean seven(int x) {
        if (x % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}




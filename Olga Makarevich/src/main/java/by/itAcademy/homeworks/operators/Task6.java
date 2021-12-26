package by.itAcademy.homeworks.operators;

//Создайте метод с одним целочисленным параметром.
//Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение


//

// Second try

public class Task6 {

    public static void main(String[] args) {
        int numberRandom = (int) (Math.random() * 100 + 1);
        System.out.println(numberRandom);
        System.out.println(foundLast7(numberRandom));

    }

    public static boolean foundLast7(int a) {
        if (a % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}




package by.itAcademy.homeworks.loops;

/**Задание 12
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */
public class Task12 {
    public static void main(String[] args){
        int fact = 1;
        int number = 0;

        while (number < 11){
            fact = Factorial(fact,number);
            System.out.println("!" + number + " = " + fact);
            number++;
        }
    }

    public static int Factorial(int fact, int i){
        if (i < 1){
            return 1;
        } else {
            return fact *= i;
        }
    }
}

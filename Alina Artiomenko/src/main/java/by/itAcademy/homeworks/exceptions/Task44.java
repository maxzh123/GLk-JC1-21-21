package by.itAcademy.homeworks.exceptions;
import java.util.ArrayList;
import java.util.Scanner;

/**Задание 43
 * 1. Написать собственное исключение от Exception
 * 2. Написать код, который будет выбрасывать заданное исключение и обрабатывать его
 * 3. Результат работы программы вывести на экран
 */

public class Task44 {
    public static void main(String[] args){
        ArrayList<String> listOfMonth = createListOfMonth();
        System.out.println(listOfMonth);

        Scanner inputMonth = new Scanner(System.in);

        while(listOfMonth.size() != 12) {
            try {
                System.out.print("Введите название месяца: ");
                String month = inputMonth.nextLine();
                checkTheValue(month,listOfMonth);
                listOfMonth.add(month);
                System.out.println(listOfMonth);
            } catch (ScannerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static ArrayList<String> createListOfMonth(){
        ArrayList<String> month = new ArrayList<>();
        month.add("September");
        month.add("November");
        month.add("May");
        month.add("April");

        return month;
    }

    public static void checkTheValue(String value, ArrayList<String> list) throws ScannerException{
        if(list.contains(value)){
            throw new ScannerException("Такой месяц уже задан!");
        }
    }

}

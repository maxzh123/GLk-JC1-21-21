package by.itAcademy.homeworks.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**Задание 43
 * 1. Написать код, который выбрасывает NullPointerException
 * 2. Написать обработчик этого исключения
 * 3. Вывести на экран сообщение, которое будет содержать описание данного исключения
 */

public class Task43 {
    public static void main(String[] args){
        ArrayList<String> listOfMonth = new ArrayList<>();
        listOfMonth.add("December");
        listOfMonth.add("November");
        listOfMonth.add(null);

        try{
            equalsDecember(listOfMonth);
        } catch (NullPointerException e){
            System.out.println("*** Попытка сравнения null объекта");
        }
    }

    public static void equalsDecember (ArrayList<String> list) throws NullPointerException{
        for (String l : list){
            System.out.println(l.equals("November"));
        }
    }
}

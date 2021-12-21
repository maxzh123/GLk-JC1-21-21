package by.itAcademy.homeworks.collections;
import java.util.ArrayList;
import java.util.Iterator;

/**Задание 39
 * 1. Создать список оценок учеников с помощью ArrayList
 * 2. Заполнить случайными оценками
 * 3. Удалить неудовлетворительные оценки из списка
 */

public class Task39 {
    public static void main (String[] args){
        int numberOfScore = 10;
        ArrayList<Integer> score = createAndFillList(numberOfScore);
        System.out.println("Исходный список: " + score);
        System.out.println("После удаления значений < 6: " + removeBadScore(score));
    }

    //create new list and fill it
    public static ArrayList<Integer> createAndFillList(int number){
        ArrayList<Integer> list = new ArrayList<Integer>(number);
        for (int i = 0; i < number; i++){
            list.add((int)(Math.random() * 10 + 1));
        }
        return list;
    }

    //remove score < 6
    public static ArrayList<Integer> removeBadScore(ArrayList<Integer> list){
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()){
            Integer next = iter.next();
            if(next < 6){
                iter.remove();
            }
        }
        return list;
    }


}

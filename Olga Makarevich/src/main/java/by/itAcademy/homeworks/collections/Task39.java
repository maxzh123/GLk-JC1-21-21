package by.itAcademy.homeworks.collections;

// Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;

public class Task39 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfStudentsAssessment = new ArrayList<>();
        System.out.println(createArrayListRandom(listOfStudentsAssessment, 10));
        System.out.println(returnListWithoutUnsatisfactoryMarks(listOfStudentsAssessment));
    }

    public static ArrayList<Integer> createArrayListRandom(ArrayList<Integer> random, int a) {
        for (int j = 0; j < a; j++) {
            int b = (int) (Math.random() * a + 1);
            random.add(j, b);
        }
        return random;
    }

    static ArrayList<Integer> returnListWithoutUnsatisfactoryMarks(ArrayList<Integer> listWithoutUnsatisfactoryMarks) {
        for (int i = 0; i < listWithoutUnsatisfactoryMarks.size(); i++) {
            if (listWithoutUnsatisfactoryMarks.get(i) <= 4) {
                listWithoutUnsatisfactoryMarks.remove(i);
                i--;
            }
        }
        return listWithoutUnsatisfactoryMarks;
    }
}
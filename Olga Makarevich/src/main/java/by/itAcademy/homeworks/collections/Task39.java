package by.itAcademy.homeworks.collections;

// Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;

public class Task39 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfStudentsAssessment = new ArrayList<>();
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        listOfStudentsAssessment.add((int) (Math.random() * 10 + 1));
        System.out.println(listOfStudentsAssessment);
        System.out.println(returnListWithoutUnsatisfactoryMarks(listOfStudentsAssessment));
    }

    static ArrayList returnListWithoutUnsatisfactoryMarks(ArrayList <Integer> listWithoutUnsatisfactoryMarks) {
        for (int i = 0; i < listWithoutUnsatisfactoryMarks.size(); i++) {
            if (listWithoutUnsatisfactoryMarks.get(i) <= 4) {
                listWithoutUnsatisfactoryMarks.remove(i);
            }
        }
        return listWithoutUnsatisfactoryMarks;
    }
}
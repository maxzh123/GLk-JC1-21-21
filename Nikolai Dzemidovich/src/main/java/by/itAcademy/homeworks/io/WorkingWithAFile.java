package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.collections.OperationsWithArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithAFile {
    private final String path = "Nikolai Dzemidovich" + File.separator + "src" + File.separator +
            "main" + File.separator + "java" + File.separator + "by" + File.separator + "itAcademy" + File.separator +
            "homeworks" + File.separator + "io" + File.separator;
    private String fileName;
    private List<Integer> list = new ArrayList<>();

    public WorkingWithAFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return path + fileName;
    }

    public String readFile() {
        StringBuilder str = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFilePath()))) {
            String temp = bufferedReader.readLine();
            while (temp != null) {
                str.append(temp);
                temp = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return String.valueOf(str);

    } public void displayListOfNumber (String str){

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            list.add(Integer.parseInt(matcher.group()));
        }
        System.out.println("В файле находятся следующие числа: ");
        for(Integer number : list){
            System.out.print(number + " ");
        }

    } public Integer sumOfNumberInFile (){
        Iterator<Integer> iterator = list.iterator();
        Integer sum = 0;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            sum+= next;
        }
        return sum;
    } public List<Integer> displayListWithoutRepetitions(){
        System.out.println("Список чисел в файле без повторений : ");
        OperationsWithArrayList.deleteDuplicate(list);
        return list;
    }
}

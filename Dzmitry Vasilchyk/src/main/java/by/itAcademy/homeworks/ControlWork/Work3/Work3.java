package by.itAcademy.homeworks.ControlWork.Work3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**Сгенерировать 10 объектов класса Car у которых характеристики name(String),
 * carModel (Enum с тремя объектами-значениями), engineСapacity(int в диапазоне 1-3).
 * Сгруппировать их по engineСapacity используя Map<Integer, List<Car>>
 * Для произвольного значения engineСapacity записать в файл соответствующий список объектов в формате:
 * <name> : <carMode> : engineСapacity **/

public class Work3 {
    public static void main(String[] args) {
        String path = "Dzmitry Vasilchyk/src/main/java/by/itAcademy/homeworks/ControlWork/Work3/";
        File file = new File(path + "fileToWork3.txt");
        writerFile(file,getList());
    }
    public static List<CAR> gruppCar() {
        List<CAR> massiv = getListOfCar();
        Map<Integer, List<CAR>> carEngineCapacity = massiv.stream().collect(
                Collectors.groupingBy(CAR::getEngineСapacity));
        for (Map.Entry<Integer, List<CAR>> item : carEngineCapacity.entrySet()) {
            System.out.println(item.getKey());
            for (CAR car : item.getValue()) {
                System.out.println(car.getName() + " " + car.getModel() + " " + car.getEngineСapacity());
            }
            System.out.println();
        }
        return massiv;
    }
    public static List<CAR> getListOfCar() {
        ArrayList<CAR> massiv = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            massiv.add(new CAR());
        }
        return massiv;
    }
    public static void writerFile(File file, List<CAR> car) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (CAR auto : car) {
                writer.write(auto + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<CAR> getList() {
        int i=(int)(Math.random()*3+1);
        List<CAR>mas=new ArrayList<>();
        List<CAR> massiv = gruppCar();
        for(CAR car:massiv){
            if(car.getEngineСapacity()==i){
                mas.add(car);
    }
}
        return mas;
    }
}

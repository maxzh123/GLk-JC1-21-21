package ExamTask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

/**
 *Сгенерировать 10 объектов класса Car у которых характеристики name(String),
 * carModel (Enum с тремя объектами-значениями), engineСapacity(int в диапазоне 1-3).
 * Сгруппировать их по engineСapacity используя Map<Integer, List<Car>>
 * Для произвольного значения engineСapacity записать в файл соответствующий список объектов в формате:
 * <name> : <carMode> : engineСapacity
 */
public class Task3 {
    public static void main(String[] args) {
        List<Car> list1 = new ArrayList<>();
        List<Car> list2 = new ArrayList<>();
        List<Car> list3 = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i<10; i++){
            Car car = new Car("car"+i, CarModel.getRandomModel(), random.nextInt(3)+1);
            switch (car.getEngineСapacity()){ //распределяем авто в листы в зависимости
                case 1:
                    list1.add(car);
                    break;
                case 2:
                    list2.add(car);
                    break;
                case 3:
                    list3.add(car);
                    break;
            }
        }

        Map<Integer, List<Car>> map = new HashMap<Integer, List<Car>>();
        map.put(1, list1);
        map.put(2, list2);
        map.put(3, list3);
        choiceList(map);
    }



    public static void choiceList(Map<Integer, List<Car>> map){ //выбор рандомного листа из мапы для печти в файл
        Random random = new Random();
        int i = random.nextInt(3)+1;
        for (Map.Entry<Integer, List<Car>> entry: map.entrySet()) {
            if(entry.getKey()==i)
                try {
                    addToFile(entry.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }



    public static void addToFile(List<Car> list) throws Exception{  //пишем в файл
        File file = new File("E:\\catalog.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Car car: list){
            writer.write(car.getName()+" : "+ car.getModel()+" : "+ car.getEngineСapacity()+"\n");
        }

        writer.close();

    }
}

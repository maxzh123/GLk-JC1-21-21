package by.itAcademy.homeworks.dataFormats;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

/**Задание 76
 * 1. Распарсить JSON-файл
 * 2. Вывести на экран
 */
public class Task76 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Map<String, Object> jsonMap = mapper.readValue(Task76.class.getClassLoader().getResourceAsStream("MyJSON.json"), Map.class);

            for (String key : jsonMap.keySet()) {
                System.out.println(key + "->" + jsonMap.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

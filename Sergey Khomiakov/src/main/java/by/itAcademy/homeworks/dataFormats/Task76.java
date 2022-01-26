package by.itAcademy.homeworks.dataFormats;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.Example;

import java.io.IOException;
import java.util.Map;

/**
 * Задание 76
 * Создать программу, которая будет разбирать json файл и выводить его на экран в текстовом виде.
 */

public class Task76 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            Map<String, Object> jsonMap = mapper.readValue(Example.class.getClassLoader().getResourceAsStream("Info.json"), Map.class);
            for (String key : jsonMap.keySet()) {
                System.out.println(key + "->" + jsonMap.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


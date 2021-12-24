import by.itAcademy.homeworks.collections.Task42;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task42Test {
    private static List<String>  expectedArray;
    private static String originalLine;
    private static Map<String, Integer> expectedMap;

    @BeforeAll
    public static void setUpForTask42Test(){
        expectedArray = new ArrayList<>();
        expectedArray.add("Привет");
        expectedArray.add("Я");
        expectedArray.add("человек");
        expectedArray.add("который");
        expectedArray.add("пытается");
        expectedArray.add("что-то");
        expectedArray.add("делать");
        expectedArray.add("Мир");
        expectedArray.add("мир");
        expectedArray.add("мир");

        expectedMap = new HashMap<>();
        expectedMap.put("Привет",1);
        expectedMap.put("Я",1);
        expectedMap.put("человек",1);
        expectedMap.put("который",1);
        expectedMap.put("пытается",1);
        expectedMap.put("что-то",1);
        expectedMap.put("делать",1);
        expectedMap.put("Мир",1);
        expectedMap.put("мир",2);

        originalLine = "Привет! Я - человек, который пытается что-то делать. Мир, мир, мир!";

    }

    @AfterAll
    public static void cleanThisTest(){
        expectedArray = null;
        expectedMap = null;
        originalLine = null;
    }

    @Test
    void testGetEachWordFromString(){
        Assertions.assertEquals(expectedArray, Task42.getEachWordFromString(originalLine));
    }

    @Test
    void testGetMapForDividedString(){
        Assertions.assertEquals(expectedMap, Task42.getMapForDividedString(expectedArray));
    }
}

import by.itAcademy.homeworks.collections.Task42;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task42Test {
    private static List<String> testList1 = new ArrayList<>();
    private static List<String> testList2 = new ArrayList<>();
    private static Map<String, Integer> testMap1 = new LinkedHashMap<>();
    private static Map<String, Integer> testMap2 = new LinkedHashMap<>();
    private static final Map<String, Integer> mapFinal1 = new LinkedHashMap<>();
    private static final Map<String, Integer> mapFinal2 = new LinkedHashMap<>();

    @BeforeAll
    public static void setUp(){
        testList1 = Task42.convertTextToAnArrayOfWords("Я учу java, я учу java");
        testMap1 = Task42.getMapFromList(testList1);
        mapFinal1.put("я",2);
        mapFinal1.put("учу",2);
        mapFinal1.put("java",2);

        testList2 = Task42.convertTextToAnArrayOfWords("Это карт-бланш, на столе телефон, на столе ноутбук");
        testMap2 = Task42.getMapFromList(testList2);
        mapFinal2.put("это",1);
        mapFinal2.put("карт-бланш",1);
        mapFinal2.put("на",2);
        mapFinal2.put("столе",2);
        mapFinal2.put("телефон",1);
        mapFinal2.put("ноутбук",1);
    }

    @AfterAll
    public static void tearDown() {
        testList1.clear();
        testMap1.clear();
        mapFinal1.clear();
        testList2.clear();
        testMap2.clear();
        mapFinal2.clear();
    }

    @Test
    void testGetMapNumberOne() {
        assertEquals(testMap1,mapFinal1);
    }

    @Test
    void testGetMapNumberTwo() {
        assertEquals(testMap2,mapFinal2);
    }
}
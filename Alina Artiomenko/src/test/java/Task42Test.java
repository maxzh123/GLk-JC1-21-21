import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import by.itAcademy.homeworks.collections.Task42;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task42Test {
    private static Map<String,Integer> listOfWords1 = new LinkedHashMap<String,Integer>();
    private static String text01;
    private static String[] arrayOfWords1;

    @BeforeAll
    public static void setUp() {
        text01 = "я не повторяю дважды, я не повторяю дважды. Честное слово!";
        arrayOfWords1 = new String[]{"я", "не", "повторяю", "дважды", "я", "не", "повторяю", "дважды", "Честное", "слово"};
        listOfWords1.put("я",2);
        listOfWords1.put("не",2);
        listOfWords1.put("повторяю", 2);
        listOfWords1.put("дважды", 2);
        listOfWords1.put("Честное", 1);
        listOfWords1.put("слово", 1);
    }

    @Test
    void testGetArrayOfWords(){
        assertArrayEquals(arrayOfWords1,Task42.getArrayOfWorlds(text01));
    }

    @Test
    void testGetMapOfWords() {
        assertEquals(listOfWords1,Task42.getMapOfWords(arrayOfWords1));
    }
}
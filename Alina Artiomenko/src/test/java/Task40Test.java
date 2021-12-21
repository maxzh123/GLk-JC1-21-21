import org.junit.jupiter.api.*;
import by.itAcademy.homeworks.collections.Task40;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task40Test {
    private static ArrayList<Integer> originalList = new ArrayList<Integer>();
    private static ArrayList<Integer> resultlList = new ArrayList<Integer>();

    @BeforeAll
    public static void setUp() {
        originalList.add(1);
        originalList.add(5);
        originalList.add(3);
        originalList.add(2);
        originalList.add(1);
        originalList.add(2);
        originalList.add(10);
        originalList.add(9);
        originalList.add(5);
        originalList.add(10);

        resultlList.add(1);
        resultlList.add(5);
        resultlList.add(3);
        resultlList.add(2);
        resultlList.add(10);
        resultlList.add(9);
    }

    @AfterAll
    public static void tearDown() {
        resultlList.clear();
        originalList.clear();
    }

    @Test
    void TestRemoveDuplicateValues() {
        assertEquals(resultlList,Task40.removeDuplicateValues(originalList));
    }
}
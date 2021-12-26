import org.junit.jupiter.api.*;
import by.itAcademy.homeworks.collections.Task41;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task41Test {
    private static ArrayList<Integer> originalList = new ArrayList<Integer>();
    private static ArrayList<Integer> originalList2 = new ArrayList<Integer>();
    private static int result;
    private static int result2;


    @BeforeAll
    public static void setUpFirst() {
        originalList.add(10);
        originalList.add(1);
        originalList.add(2);
        originalList.add(15);
        originalList.add(14);

        result = 15;

    }

    @BeforeAll
    public static void setUpSecond() {
        originalList2.add(10);
        originalList2.add(3);
        originalList2.add(14);
        originalList2.add(0);
        originalList2.add(5);

        result2 = 14;

    }

    @AfterAll
    public static void tearDownFirst() {
        originalList.clear();
        result = 0;
    }

    @AfterAll
    public static void tearDownSecond() {
        originalList.clear();
        result = 0;
    }

    @Test
    void testMaxScoreFirst() {
        assertEquals(result,Task41.maxScore(originalList));
    }

    @Test
    void testMaxScoreSecond() {
        assertEquals(result2,Task41.maxScore(originalList2));
    }
}
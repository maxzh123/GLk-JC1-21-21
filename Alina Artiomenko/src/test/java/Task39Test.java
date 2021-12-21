import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import by.itAcademy.homeworks.collections.Task39;

class Task39Test {
    private static ArrayList<Integer> originalArrayList = new ArrayList<Integer>();
    private static ArrayList<Integer> resultArrayList = new ArrayList<Integer>();

    @BeforeAll
    public static void setUp() {
        originalArrayList.add(5);
        originalArrayList.add(1);
        originalArrayList.add(10);
        originalArrayList.add(9);
        originalArrayList.add(8);
        originalArrayList.add(3);
        originalArrayList.add(4);
        originalArrayList.add(6);
        originalArrayList.add(1);
        originalArrayList.add(7);

        resultArrayList.add(10);
        resultArrayList.add(9);
        resultArrayList.add(8);
        resultArrayList.add(6);
        resultArrayList.add(7);
    }

    @AfterAll
    public static void tearDown() {
        originalArrayList.clear();
        resultArrayList.clear();
    }

    @Test
    void testRemoveBadScore() {
        assertEquals(resultArrayList, Task39.removeBadScore(originalArrayList));
    }
}
import by.itAcademy.homeworks.collections.Task41;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task41Test {
    private static final List<Integer> arrayListInitial = new ArrayList<>();

    @BeforeAll
    public static void setUpArrayList(){
        arrayListInitial.add(1);
        arrayListInitial.add(9);
        arrayListInitial.add(5);
        arrayListInitial.add(4);
        arrayListInitial.add(7);
        arrayListInitial.add(9);
        arrayListInitial.add(10);
    }

    @AfterAll
    public static void tearDownArrayList() {
        arrayListInitial.clear();
    }

    @Test
    void testMaxAssessment() {
        assertEquals(Task41.maxAssessment(arrayListInitial), 10);
    }
}
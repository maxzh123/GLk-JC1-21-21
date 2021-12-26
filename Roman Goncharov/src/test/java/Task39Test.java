import by.itAcademy.homeworks.collections.Task39;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task39Test {
    private static final List<Integer> arrayListInitial = new ArrayList<>();
    private static final List<Integer> arrayListFinal = new ArrayList<>();

    @BeforeAll
    public static void setUpArrayLists(){
        arrayListInitial.add(1);
        arrayListInitial.add(9);
        arrayListInitial.add(5);
        arrayListInitial.add(4);
        arrayListInitial.add(7);
        arrayListInitial.add(9);
        arrayListInitial.add(10);

        arrayListFinal.add(9);
        arrayListFinal.add(7);
        arrayListFinal.add(9);
        arrayListFinal.add(10);
    }

    @AfterAll
    public static void tearDownArrayLists() {
        arrayListInitial.clear();
        arrayListFinal.clear();
    }

    @Test
    void testRemovingElements() {
        assertEquals(Task39.removingElements(arrayListInitial), arrayListFinal);
    }
}

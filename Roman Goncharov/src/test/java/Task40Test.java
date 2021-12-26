import by.itAcademy.homeworks.collections.Task40;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task40Test {
    private static List<Integer> arrayListInitial = new ArrayList<>();
    private static final List<Integer> arrayListFinal = new ArrayList<>();

    @BeforeAll
    public static void setUpArrayLists(){
        arrayListInitial.add(1);
        arrayListInitial.add(1);
        arrayListInitial.add(3);
        arrayListInitial.add(4);
        arrayListInitial.add(3);
        arrayListInitial.add(4);
        arrayListInitial.add(7);

        arrayListFinal.add(1);
        arrayListFinal.add(3);
        arrayListFinal.add(4);
        arrayListFinal.add(7);
    }

    @AfterAll
    public static void tearDownArrayLists() {
        arrayListInitial.clear();
        arrayListFinal.clear();
    }

    @Test
    void testRemoveRepetitions() {
        arrayListInitial = new ArrayList<>(Task40.removeRepetitions(arrayListInitial));
        assertEquals(arrayListInitial, arrayListFinal);
    }
}
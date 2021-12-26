import by.itAcademy.homeworks.collections.Task39;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task39Test {
    private static List<Integer> originalArray = new ArrayList<>();
    private static List<Integer> expectArray = new ArrayList<>();

    @BeforeAll
    public static void setUpForTestDeleteBadMarks(){
        originalArray.add(1);
        originalArray.add(4);
        originalArray.add(8);
        originalArray.add(0);
        originalArray.add(10);
        originalArray.add(9);

        expectArray.add(8);
        expectArray.add(10);
        expectArray.add(9);

    }

    @AfterAll
    public static void cleanThisTest(){
        originalArray = null;
        expectArray = null;
    }

    @Test
    void testDeleteBadMarks(){
            Assertions.assertEquals(expectArray, Task39.deleteBadMarks(originalArray));
    }


}

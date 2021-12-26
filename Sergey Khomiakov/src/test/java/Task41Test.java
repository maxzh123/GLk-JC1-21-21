import by.itAcademy.homeworks.collections.Task41;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task41Test {
    private static List<Integer> originalArray;
    private static Integer maxValue;

    @BeforeAll
    public static void setUpForTestDeleteBadMarks(){
        originalArray = new ArrayList<>();
        originalArray.add(1);
        originalArray.add(4);
        originalArray.add(-10);
        originalArray.add(0);
        originalArray.add(7);
        originalArray.add(9);

        maxValue = 9;

    }

    @AfterAll
    public static void cleanThisTest(){
        originalArray = null;
        maxValue = null;
    }

    @Test
    public void testGetMaxValue(){
        Assertions.assertEquals(maxValue, Task41.getMaxValue(originalArray));
    }

}

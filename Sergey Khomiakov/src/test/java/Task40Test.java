import by.itAcademy.homeworks.collections.Task40;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task40Test {

    @Test
    void testHelperForDeleteRepeats (){
        List<Integer> originalArray = new ArrayList<>();
        List<Integer> expectArray = new ArrayList<>();

        originalArray.add(1);
        originalArray.add(2);
        originalArray.add(10);
        originalArray.add(2);
        originalArray.add(0);

        originalArray.add(1);

        expectArray.add(1);
        expectArray.add(2);
        expectArray.add(10);
        expectArray.add(0);

        Assertions.assertEquals(expectArray, Task40.helperForRemoveRepeats(originalArray));

    }


}

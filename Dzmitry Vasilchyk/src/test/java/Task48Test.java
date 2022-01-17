import by.itAcademy.homeworks.io.Task48;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task48Test {
    @Test
    void test(){
        File file=new File("C://GLk-JC1-21-21//Dzmitry Vasilchyk//src//main//java//by//itAcademy//homeworks//io//fileToTask48");
        String res="первоначальный список: [0, 1, 2, 3, 10, 11, 12, 100, 101, 102, 2, 3, 4, 10, 2, 3, 4]/tсумма чисел: 370/tсписок без повторов: [0, 1, 2, 3, 100, 4, 101, 102, 10, 11, 12]";
        assertEquals(res, Task48.numberFromText(file));
    }
}

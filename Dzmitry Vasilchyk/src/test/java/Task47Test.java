import by.itAcademy.homeworks.basics.Task2;
import by.itAcademy.homeworks.io.Task47;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task47Test {
    @Test
    void test(){
        File file=new File("C://GLk-JC1-21-21//Dzmitry Vasilchyk//src//main//java//by//itAcademy//homeworks//io//fileToTask47");
        String res="знаков препинания: 10; слов: 43";
        assertEquals(res, Task47.fileTest(file));
    }
}

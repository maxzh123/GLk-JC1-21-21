import by.itAcademy.homeworks.basics.Task1;
import by.itAcademy.homeworks.basics.Task2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test2 {

    @Test
    public void test1() {
        Task1.main(null);
        Task2[] array2 = new Task2[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Task2();
        }
        // ...........
        for (int i = 0; i < array2.length; i++) {
            array2[i].add(i);
        }
        // ...........
        for (int i = 0; i < array2.length; i++) {
            System.out.print(i + ":" + "->");
            array2[i].print();
        }
        System.out.println("Сортируем");
        Arrays.sort(array2);
        for(Task2 t:array2){
            t.print();
        }

    }

}

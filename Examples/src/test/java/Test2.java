import by.itAcademy.homeworks.basics.Task1;
import by.itAcademy.homeworks.basics.Task2;
import org.junit.jupiter.api.Test;

public class Test2 {

    @Test
    public void test1(){
        Task1.main(null);
        Task2[][] array2=new Task2[10][5];
        for(int i=0;i< array2.length;i++){
            for(int j=0;j< array2[i].length;j++){
                array2[i][j]=new Task2();
            }
        }
        // ...........
        for(int i=0;i< array2.length;i++){
            for(int j=0;j< array2[i].length;j++){
                array2[i][j].add(i);
            }
        }
        // ...........
        for(int i=0;i< array2.length;i++){
            for(int j=0;j< array2[i].length;j++){
                System.out.print(i+":"+j+"->");
                array2[i][j].print();
            }
        }

    }

}
